/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.skyrat;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;



/**
 *
 * @author zts
 */
public class BinaryReadWrite {
    private DataInputStream dis=null;  
    private String s_FilePath="d:/file/2012033030731008398000714025519002";  
      
    private BinaryReadWrite() {  
        // TODO Auto-generated constructor stub  
        init();  
    }  
    
    public BinaryReadWrite(String path){
        this.s_FilePath = path;
        init();
    }
    
    private void init(){  
        try{  
            if(!new File(s_FilePath).exists()){  
                return; 
            } 
            dis=new DataInputStream(new FileInputStream(new File(s_FilePath)));  
        }catch(Exception e){  
        }  
        this.trans_list = new ArrayList();
    }  
    
    public void readFileBody() {  
        byte[] file_tail_bytes = new byte[32];
        
        try{  
            if(dis != null){  
                //解析每个交易
                for(int trans_seq = 0; trans_seq < this.tot_trans; trans_seq++){
                    TransBody tb = new TransBody();
                    //报文长度
                    byte[] trans_len_bytes = new byte[2];
                    dis.read(trans_len_bytes);
                    tb.len = Hex2Integer(trans_len_bytes);
                    //终端号
                    byte[] term_id_bytes = new byte[8];
                    dis.read(term_id_bytes);
                    tb.term_id = new String(term_id_bytes);
                    //商户号
                    byte[] mercht_id_bytes = new byte[15];
                    dis.read(mercht_id_bytes);
                    tb.mercht_id = new String(mercht_id_bytes);
                    //系统跟踪号
                    byte[] sys_tra_no_bytes = new byte[3];
                    dis.read(sys_tra_no_bytes);
                    tb.sys_tra_no = new String(BCD2Str(sys_tra_no_bytes));
                    //受卡方时间
                    byte[] local_trans_time_bytes = new byte[3];
                    dis.read(local_trans_time_bytes);
                    tb.local_trans_time = new String(BCD2Str(local_trans_time_bytes));
                    //受卡方日期
                    byte[] local_trans_date_bytes = new byte[2];
                    dis.read(local_trans_date_bytes);
                    tb.local_trans_date = new String(BCD2Str(local_trans_date_bytes));
                    //报文头
                    byte[] trans_header_bytes = new byte[6];
                    dis.read(trans_header_bytes);
                    tb.trans_header = new String(BCD2Str(trans_header_bytes));
                    //MAC校验和加密标志：3-验MAC不加密；4-不验MAC不加密
                    if (this.mac_code_in.equals("3") 
                            || this.mac_code_in.equals("4")) {
                        //报文类型
                        byte[] trans_tp_bytes = new byte[2];
                        dis.read(trans_tp_bytes);
                        tb.trans_tp = new String(BCD2Str(trans_tp_bytes));
                        //报文位图元
                        byte[] trans_bitmap_bytes = new byte[8];
                        dis.read(trans_bitmap_bytes);
                        tb.trans_bitmap = Binary2Byte(trans_bitmap_bytes);
                        //卡号长度
                        byte[] card_no_len_bytes = new byte[1];
                        dis.read(card_no_len_bytes);
                        tb.card_no_len = Integer.valueOf(new String(BCD2Str(card_no_len_bytes))).intValue();
                        //卡号
                        byte[] card_no_bytes = new byte[(tb.card_no_len + 1) / 2];
                        dis.read(card_no_bytes);
                        tb.card_no = new String(BCD2Str(card_no_bytes));
                        //交易处理码
                        byte[] trans_proc_cd_bytes = new byte[3];
                        dis.read(trans_proc_cd_bytes);
                        tb.trans_proc_cd = new String(BCD2Str(trans_proc_cd_bytes));
                        //交易金额
                        byte[] trans_at_bytes = new byte[6];
                        dis.read(trans_at_bytes);
                        tb.trans_at = Integer.valueOf(new String(BCD2Str(trans_at_bytes))).intValue() / 100.0;
                        //卡有效期
                        if (tb.trans_bitmap[13] == '1') {
                            byte[] card_exp_date_bytes = new byte[2];
                            dis.read(card_exp_date_bytes);
                            tb.card_exp_date = new String(BCD2Str(card_exp_date_bytes));
                        }
                        //服务点输入方式码
                        byte[] service_entry_md_cd_bytes = new byte[2];
                        dis.read(service_entry_md_cd_bytes);
                        tb.service_entry_md_cd = new String(BCD2Str(service_entry_md_cd_bytes)).substring(0, 3);
                        //卡片序列号
                        if (tb.trans_bitmap[22] == '1') {
                            byte[] card_seq_no_bytes = new byte[2];
                            dis.read(card_seq_no_bytes);
                            tb.card_seq_no = new String(BCD2Str(card_seq_no_bytes)).substring(0, 3);
                        }
                        //服务点条件码
                        byte[] service_cond_cd_bytes = new byte[1];
                        dis.read(service_cond_cd_bytes);
                        tb.service_cond_cd = new String(BCD2Str(service_cond_cd_bytes));
                        //服务点PIN获取码
                        if (tb.trans_bitmap[25] == '1') {
                            byte[] pos_pin_capt_cd_bytes = new byte[1];
                            dis.read(pos_pin_capt_cd_bytes);
                            tb.pos_pin_capt_cd = new String(BCD2Str(pos_pin_capt_cd_bytes));
                        }
                        //交易货币代码
                        byte[] trans_currency_cd_bytes = new byte[3];
                        dis.read(trans_currency_cd_bytes);
                        tb.trans_currency_cd = new String(trans_currency_cd_bytes);
                        //F55域长度
                        byte[] ic_data_len_bytes = new byte[2];
                        dis.read(ic_data_len_bytes);
                        tb.ic_data_len = Integer.valueOf(new String(BCD2Str(ic_data_len_bytes))).intValue();
                        //解析55域子域
                        String tag = "";
                        while (tag.equals("8A") == false) {
                            byte[] tag_bytes = new byte[1];
                            byte[] len_bytes = new byte[1];
                            byte[] value_bytes;
                            int len_tmp;
                            String value_tmp = "";
                            dis.read(tag_bytes);
                            tag = new String(BCD2Str(tag_bytes));
                            if (tag.equals("9F")
                                    || tag.equals("5F")) {
                                dis.read(tag_bytes);
                                tag = tag + new String(BCD2Str(tag_bytes));
                            }
                            dis.read(len_bytes);
                            len_tmp = Hex2Integer(len_bytes);
                            value_bytes = new byte[len_tmp];
                            dis.read(value_bytes);
                            if (tb.F55.containsKey(tag)) {
                                TLV tlv = (TLV) tb.F55.get(tag);
                                if (tlv.len != 0 && tlv.len != len_tmp) {
                                    return;
                                }
                                tlv.len = len_tmp;
                                switch (tlv.cd_tp) {
                                    case 0:
                                    case 1:
                                        tlv.value = new String(BCD2Str(value_bytes));
                                        break;
                                    case 2:
                                        tlv.value = new String(value_bytes);
                                }
                            } else {
                                return;
                            }
                        }//while-end
                        //F60长度
                        byte[] F60_len_bytes = new byte[2];
                        dis.read(F60_len_bytes);
                        tb.F60_len = Integer.valueOf(new String(BCD2Str(F60_len_bytes)));
                        //F60.1
                        byte[] F60_1_bytes = new byte[1];
                        dis.read(F60_1_bytes);
                        tb.F60_1 = new String(BCD2Str(F60_1_bytes));
                        //F60.2
                        byte[] F60_2_bytes = new byte[3];
                        dis.read(F60_2_bytes);
                        tb.F60_2 = new String(BCD2Str(F60_2_bytes));
                        //F60.3
                        byte[] F60_3_bytes = new byte[2];
                        dis.read(F60_3_bytes);
                        tb.F60_3 = new String(BCD2Str(F60_3_bytes));
                        //F60.4和F60.5
                        byte[] F60_4_5_bytes = new byte[1];
                        dis.read(F60_4_5_bytes);
                        tb.F60_4 = new String(BCD2Str(F60_4_5_bytes)).substring(0, 1);
                        tb.F60_5 = new String(BCD2Str(F60_4_5_bytes)).substring(1);
                        //F63长度
                        byte[] F63_len_bytes = new byte[2];
                        dis.read(F63_len_bytes);
                        tb.F63_len = Integer.valueOf(new String(BCD2Str(F63_len_bytes)));
                        //F63.1
                        byte[] F63_1_bytes = new byte[3];
                        dis.read(F63_1_bytes);
                        tb.F63_1 = new String(F63_1_bytes);
                        //如果MAC校验和加密标志为3，则要读MAC
                        if(this.mac_code_in.equals("3") && tb.trans_bitmap[63] == '1'){
                            byte[] MAC_bytes = new byte[8];
                            dis.read(MAC_bytes);
                            tb.MAC = new String(BCD2Str(MAC_bytes));
                        }
                    }
                    //MAC校验加密和：1-验MAC加密；2-不验MAC加密
                    else if(this.mac_code_in.equals("1")
                            || this.mac_code_in.equals("2")){
                        byte[] DivData2 = this.join(term_id_bytes, sys_tra_no_bytes);
                        DivData2 = this.join(DivData2, local_trans_time_bytes);
                        DivData2 = this.join(DivData2, local_trans_date_bytes);
                        byte[] DivData1 = this.join(mercht_id_bytes, new byte[] {(byte)0x80});
                        byte[] mak;
                        mak = this.generateMAK(DivData1, DivData2);
                        if(mak == null) return;
                        byte[] mak24 = new byte[24];
                        System.arraycopy(mak, 0, mak24, 0, 16);
                        System.arraycopy(mak, 0, mak24, 16, 8);
                        int trans_body_len = tb.len - 37;
                        byte[] trans_body_bytes = new byte[trans_body_len%8 == 0 ? trans_body_len : (trans_body_len/8+1)*8];
                        dis.read(trans_body_bytes);
                        trans_body_bytes = this.decryptMode(mak24, trans_body_bytes);
                        int bytes_pointer = 0;
                        //报文类型
                        byte[] trans_tp_bytes = new byte[2];
                        System.arraycopy(trans_body_bytes, bytes_pointer, trans_tp_bytes, 0, trans_tp_bytes.length);
                        bytes_pointer += trans_tp_bytes.length;
                        tb.trans_tp = new String(BCD2Str(trans_tp_bytes));
                        //报文位图元
                        byte[] trans_bitmap_bytes = new byte[8];
                        System.arraycopy(trans_body_bytes, bytes_pointer, trans_bitmap_bytes, 0, trans_bitmap_bytes.length);
                        bytes_pointer += trans_bitmap_bytes.length;
                        tb.trans_bitmap = Binary2Byte(trans_bitmap_bytes);
                        //卡号长度
                        byte[] card_no_len_bytes = new byte[1];
                        System.arraycopy(trans_body_bytes, bytes_pointer, card_no_len_bytes, 0, card_no_len_bytes.length);
                        bytes_pointer += card_no_len_bytes.length;
                        tb.card_no_len = Integer.valueOf(new String(BCD2Str(card_no_len_bytes))).intValue();
                        //卡号
                        byte[] card_no_bytes = new byte[(tb.card_no_len + 1) / 2];
                        System.arraycopy(trans_body_bytes, bytes_pointer, card_no_bytes, 0, card_no_bytes.length);
                        bytes_pointer += card_no_bytes.length;
                        tb.card_no = new String(BCD2Str(card_no_bytes));
                        //交易处理码
                        byte[] trans_proc_cd_bytes = new byte[3];
                        System.arraycopy(trans_body_bytes, bytes_pointer, trans_proc_cd_bytes, 0, trans_proc_cd_bytes.length);
                        bytes_pointer += trans_proc_cd_bytes.length;
                        tb.trans_proc_cd = new String(BCD2Str(trans_proc_cd_bytes));
                        //交易金额
                        byte[] trans_at_bytes = new byte[6];
                        System.arraycopy(trans_body_bytes, bytes_pointer, trans_at_bytes, 0, trans_at_bytes.length);
                        bytes_pointer += trans_at_bytes.length;
                        tb.trans_at = Integer.valueOf(new String(BCD2Str(trans_at_bytes))).intValue() / 100.0;
                        //卡有效期
                        if (tb.trans_bitmap[13] == '1') {
                            byte[] card_exp_date_bytes = new byte[2];
                            System.arraycopy(trans_body_bytes, bytes_pointer, card_exp_date_bytes, 0, card_exp_date_bytes.length);
                            bytes_pointer += card_exp_date_bytes.length;
                            tb.card_exp_date = new String(BCD2Str(card_exp_date_bytes));
                        }
                        //服务点输入方式码
                        byte[] service_entry_md_cd_bytes = new byte[2];
                        System.arraycopy(trans_body_bytes, bytes_pointer, service_entry_md_cd_bytes, 0, service_entry_md_cd_bytes.length);
                        bytes_pointer += service_entry_md_cd_bytes.length;
                        tb.service_entry_md_cd = new String(BCD2Str(service_entry_md_cd_bytes)).substring(0, 3);
                        //卡片序列号
                        if (tb.trans_bitmap[22] == '1') {
                            byte[] card_seq_no_bytes = new byte[2];
                            System.arraycopy(trans_body_bytes, bytes_pointer, card_seq_no_bytes, 0, card_seq_no_bytes.length);
                            bytes_pointer += card_seq_no_bytes.length;
                            tb.card_seq_no = new String(BCD2Str(card_seq_no_bytes)).substring(0, 3);
                        }
                        //服务点条件码
                        byte[] service_cond_cd_bytes = new byte[1];
                        System.arraycopy(trans_body_bytes, bytes_pointer, service_cond_cd_bytes, 0, service_cond_cd_bytes.length);
                        bytes_pointer += service_cond_cd_bytes.length;
                        tb.service_cond_cd = new String(BCD2Str(service_cond_cd_bytes));
                        //服务点PIN获取码
                        if (tb.trans_bitmap[25] == '1') {
                            byte[] pos_pin_capt_cd_bytes = new byte[1];
                            System.arraycopy(trans_body_bytes, bytes_pointer, pos_pin_capt_cd_bytes, 0, pos_pin_capt_cd_bytes.length);
                            bytes_pointer += pos_pin_capt_cd_bytes.length;
                            tb.pos_pin_capt_cd = new String(BCD2Str(pos_pin_capt_cd_bytes));
                        }
                        //交易货币代码
                        byte[] trans_currency_cd_bytes = new byte[3];
                        System.arraycopy(trans_body_bytes, bytes_pointer, trans_currency_cd_bytes, 0, trans_currency_cd_bytes.length);
                        bytes_pointer += trans_currency_cd_bytes.length;
                        tb.trans_currency_cd = new String(trans_currency_cd_bytes);
                        //F55域长度
                        byte[] ic_data_len_bytes = new byte[2];
                        System.arraycopy(trans_body_bytes, bytes_pointer, ic_data_len_bytes, 0, ic_data_len_bytes.length);
                        bytes_pointer += ic_data_len_bytes.length;
                        tb.ic_data_len = Integer.valueOf(new String(BCD2Str(ic_data_len_bytes))).intValue();
                        //解析55域子域
                        String tag = "";
                        while (tag.equals("8A") == false) {
                            byte[] tag_bytes = new byte[1];
                            byte[] len_bytes = new byte[1];
                            byte[] value_bytes;
                            int len_tmp;
                            String value_tmp = "";
                            System.arraycopy(trans_body_bytes, bytes_pointer, tag_bytes, 0, tag_bytes.length);
                            bytes_pointer += tag_bytes.length;
                            tag = new String(BCD2Str(tag_bytes));
                            if (tag.equals("9F")
                                    || tag.equals("5F")) {
                                System.arraycopy(trans_body_bytes, bytes_pointer, tag_bytes, 0, tag_bytes.length);
                                bytes_pointer += tag_bytes.length;
                                tag = tag + new String(BCD2Str(tag_bytes));
                            }
                            System.arraycopy(trans_body_bytes, bytes_pointer, len_bytes, 0, len_bytes.length);
                            bytes_pointer += len_bytes.length;
                            len_tmp = Hex2Integer(len_bytes);
                            value_bytes = new byte[len_tmp];
                            System.arraycopy(trans_body_bytes, bytes_pointer, value_bytes, 0, value_bytes.length);
                            bytes_pointer += value_bytes.length;
                            if (tb.F55.containsKey(tag)) {
                                TLV tlv = (TLV) tb.F55.get(tag);
                                if (tlv.len != 0 && tlv.len != len_tmp) {
                                    return;
                                }
                                tlv.len = len_tmp;
                                switch (tlv.cd_tp) {
                                    case 0:
                                    case 1:
                                        tlv.value = new String(BCD2Str(value_bytes));
                                        break;
                                    case 2:
                                        tlv.value = new String(value_bytes);
                                }
                            } else {
                                return;
                            }
                        }//while-end
                        //F60长度
                        byte[] F60_len_bytes = new byte[2];
                        System.arraycopy(trans_body_bytes, bytes_pointer, F60_len_bytes, 0, F60_len_bytes.length);
                        bytes_pointer += F60_len_bytes.length;
                        tb.F60_len = Integer.valueOf(new String(BCD2Str(F60_len_bytes)));
                        //F60.1
                        byte[] F60_1_bytes = new byte[1];
                        System.arraycopy(trans_body_bytes, bytes_pointer, F60_1_bytes, 0, F60_1_bytes.length);
                        bytes_pointer += F60_1_bytes.length;
                        tb.F60_1 = new String(BCD2Str(F60_1_bytes));
                        //F60.2
                        byte[] F60_2_bytes = new byte[3];
                        System.arraycopy(trans_body_bytes, bytes_pointer, F60_2_bytes, 0, F60_2_bytes.length);
                        bytes_pointer += F60_2_bytes.length;
                        tb.F60_2 = new String(BCD2Str(F60_2_bytes));
                        //F60.3
                        byte[] F60_3_bytes = new byte[2];
                        System.arraycopy(trans_body_bytes, bytes_pointer, F60_3_bytes, 0, F60_3_bytes.length);
                        bytes_pointer += F60_3_bytes.length;
                        tb.F60_3 = new String(BCD2Str(F60_3_bytes));
                        //F60.4和F60.5
                        byte[] F60_4_5_bytes = new byte[1];
                        System.arraycopy(trans_body_bytes, bytes_pointer, F60_4_5_bytes, 0, F60_4_5_bytes.length);
                        bytes_pointer += F60_4_5_bytes.length;
                        tb.F60_4 = new String(BCD2Str(F60_4_5_bytes)).substring(0, 1);
                        tb.F60_5 = new String(BCD2Str(F60_4_5_bytes)).substring(1);
                        //F63长度
                        byte[] F63_len_bytes = new byte[2];
                        System.arraycopy(trans_body_bytes, bytes_pointer, F63_len_bytes, 0, F63_len_bytes.length);
                        bytes_pointer += F63_len_bytes.length;
                        tb.F63_len = Integer.valueOf(new String(BCD2Str(F63_len_bytes)));
                        //F63.1
                        byte[] F63_1_bytes = new byte[3];
                        System.arraycopy(trans_body_bytes, bytes_pointer, F63_1_bytes, 0, F63_1_bytes.length);
                        bytes_pointer += F63_1_bytes.length;
                        tb.F63_1 = new String(F63_1_bytes);
                        //如果MAC校验和加密标志为1，则要读MAC
                        if(this.mac_code_in.equals("1") && tb.trans_bitmap[63] == '1'){
                            byte[] MAC_bytes = new byte[8];
                            System.arraycopy(trans_body_bytes, bytes_pointer, MAC_bytes, 0, MAC_bytes.length);
                            bytes_pointer += MAC_bytes.length;
                            tb.MAC = new String(BCD2Str(MAC_bytes));
                        }
                    }
                    else return;
                    
                    this.trans_list.add(tb);
                }//for-end
                
            }  //if-end
        }catch(Exception e){  
            System.out.println(e);
            return;
        }
        try {
            dis.read(file_tail_bytes);
            this.file_tail = new String(file_tail_bytes);
            dis.close();
        } catch (IOException ex) {
            Logger.getLogger(BinaryReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        } 
        this.read_success_flag = true;
    }
    
    public boolean readFileHeader() {  
        byte[] filename_bytes = new byte[30];
        byte[] version_no_bytes = new byte[4];
        byte[] file_body_len_bytes = new byte[8];
        byte[] mac_code_in_bytes = new byte[1];
        byte[] tot_trans_bytes = new byte[5];
        byte[] tot_trans_at_bytes = new byte[12];
        
        try{  
            if(dis != null){  
                dis.read(version_no_bytes);//读前四个字节，判断是不是0001
                if(new String(version_no_bytes).equals("0001")){
                    this.version_no = new String(version_no_bytes);
                    String[] filepath_tmp = this.s_FilePath.split("/");
                    this.filename = filepath_tmp[filepath_tmp.length-1];
                }
                else{//不是0001的话应该是文件名
                    dis.read(filename_bytes);
                    this.filename = new String(version_no_bytes) 
                            + new String(filename_bytes);
                    dis.read(version_no_bytes);
                    if(new String(version_no_bytes).equals("0001")){
                        this.version_no = new String(version_no_bytes);
                    }
                    else return false;//文件格式错误
                }
                //文件体长度
                dis.read(file_body_len_bytes);
                this.file_body_len = Hex2Integer(file_body_len_bytes);
                //MAC校验和加密标志
                dis.read(mac_code_in_bytes);
                this.mac_code_in = new String(mac_code_in_bytes);
                //总交易笔数
                dis.read(tot_trans_bytes);
                this.tot_trans = Integer.valueOf(new String(tot_trans_bytes)).intValue();
                //总交易金额
                dis.read(tot_trans_at_bytes);
                this.tot_trans_at = Integer.valueOf(new String(tot_trans_at_bytes)).intValue()/100.0;                
            }  //if-end
        }catch(Exception e){  
            return false;
        }
        return true;
    }
    
    
    private int Hex2Integer(byte[] bytes){
        int result = 0;
        int tmp;
        for(int i = 0; i < bytes.length; i++){
            tmp = bytes[i];
            if(tmp < 0){
                tmp += 256;
            }
            result = result*256+tmp;
        }
        return result;
    }
    
    private byte[] BCD2Str(byte[] bytes){
        byte[] result = new byte[bytes.length*2];
        int tmp;
        for(int i = 0; i < bytes.length; i++){
            tmp = bytes[i]&0x0f;
            result[2*i+1] = (byte) (tmp < 10 ? (tmp+48):(tmp+55));
            tmp = (bytes[i]>>4)&0x0f;
            result[2*i] = (byte) (tmp < 10 ? (tmp+48):(tmp+55));
        }
        return result;
    }
    
    private byte[] BCDStr2Binary(String str){
        byte[] result = new byte[str.length()/2];
        char[] chartmp = str.toCharArray();
        for(int i = 0 ; i < result.length; i++){
            int pos = i*2;
            result[i] = (byte)(toByte(chartmp[pos])<<4 | toByte(chartmp[pos+1]));
        }
        return result;
    }
    
    private byte toByte(char c){
        byte b = (byte)"0123456789ABCDEF".indexOf(c);
        return b;
    }
    
    private byte[] Binary2Byte(byte[] bytes){
        byte[] result = new byte[bytes.length*8];
        for(int i = 0; i < bytes.length; i++){
            int andop = 1;
            for(int j = 7; j >= 0; j--){
                result[8*i+j] = (byte) ((bytes[i]&andop) != 0 ? '1':'0');
                andop = andop<<1;
            }
        }
        return result;
    }
    
    public void print(){
        System.out.println("filename:"+this.filename);
        System.out.println("version_no:"+this.version_no);
        System.out.println("file_body_len:"+this.file_body_len);
        System.out.println("mac_code_in:"+this.mac_code_in);
        System.out.println("tot_trans:"+this.tot_trans);
        System.out.println("tot_trans_at:"+this.tot_trans_at);
        for(Iterator<TransBody> iter = this.trans_list.iterator();iter.hasNext();){
            TransBody tb = iter.next();
            System.out.println();
            System.out.println("trans_body_len:"+tb.len);
            System.out.println("trans_mercht_id:"+tb.mercht_id);
            System.out.println("sys_tra_no:"+tb.sys_tra_no);
            System.out.println("local_trans_time:"+tb.local_trans_time);
            System.out.println("local_tran_date:"+tb.local_trans_date);
            System.out.println("trans_header:"+tb.trans_header);
            System.out.println("trans_tp:"+tb.trans_tp);
            System.out.println("trans_bitmap:"+new String(tb.trans_bitmap));
            System.out.println("card_no_len:"+tb.card_no_len);
            System.out.println("card_no:"+tb.card_no);
            System.out.println("trans_proc_cd:"+tb.trans_proc_cd);
            System.out.println("trans_at:"+tb.trans_at);
            System.out.println("card_exp_date:"+tb.card_exp_date);
            System.out.println("service_entry_md_cd:"+tb.service_entry_md_cd);
            System.out.println("card_seq_no:"+tb.card_seq_no);
            System.out.println("service_cond_cd:"+tb.service_cond_cd);
            System.out.println("pos_pin_capt_cd:"+tb.pos_pin_capt_cd);
            System.out.println("trans_currency_cd:"+tb.trans_currency_cd);
            for(Iterator<String> iter2 = tb.F55.keySet().iterator();iter2.hasNext();){
                String tag = iter2.next();
                TLV tlv = tb.F55.get(tag);
                System.out.println(tlv.tag+" "+tlv.len+" "+tlv.value+" "+tlv.cd_tp);
            }
            System.out.println("F60_len:"+tb.F60_len);
            System.out.println("F60.1:"+tb.F60_1);
            System.out.println("F60.2:"+tb.F60_2);
            System.out.println("F60.3:"+tb.F60_3);
            System.out.println("F60.4:"+tb.F60_4);
            System.out.println("F60.5:"+tb.F60_5);
            System.out.println("F63_len:"+tb.F63_len);
            System.out.println("F63.1:"+tb.F63_1);
            System.out.println("MAC:"+tb.MAC);
        }
        System.out.println("file_tail:"+this.file_tail);
    }
    
    public byte[] encryptMode(byte[] keybyte,byte[] src){
        try {
            //生成密钥
            SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);
            //加密
            Cipher c1 = Cipher.getInstance("DESede/ECB/NoPadding");
            c1.init(Cipher.ENCRYPT_MODE, deskey);
            return c1.doFinal(src);
        } catch (java.security.NoSuchAlgorithmException e1) {
            System.out.println(e1);
        }catch(javax.crypto.NoSuchPaddingException e2){
            System.out.println(e2);
        }catch(java.lang.Exception e3){
            System.out.println(e3);
        }
        return null;
    }
    
    public byte[] decryptMode(byte[] keybyte,byte[] src){
        try {
            //生成密钥
            SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);
            //解密
            Cipher c1 = Cipher.getInstance("DESede/ECB/NoPadding");
            c1.init(Cipher.DECRYPT_MODE, deskey);
            return c1.doFinal(src);
        } catch (java.security.NoSuchAlgorithmException e1) {
            System.out.println(e1);
        }catch(javax.crypto.NoSuchPaddingException e2){
            System.out.println(e2);
        }catch(java.lang.Exception e3){
            System.out.println(e3);
        }
        return null;
    }

    public byte[] generateMAK(byte[] DivData1, byte[] DivData2){
        if(DivData1 != null && DivData2 != null){
            String tmk24 = tmk + tmk.substring(0, tmk.length()/2);
            byte[] udk = this.encryptMode(this.BCDStr2Binary(tmk24), DivData1);
            byte[] udk24 = new byte[24];
            System.arraycopy(udk, 0, udk24, 0, 16);
            System.arraycopy(udk, 0, udk24, 16, 8);
            return this.encryptMode(udk24, DivData2);
        }
        return null;
    }
    
    public byte[] join(byte[] a1, byte[] a2) {
        byte[] result = new byte[a1.length + a2.length];
        System.arraycopy(a1, 0, result, 0, a1.length);
        System.arraycopy(a2, 0, result, a1.length, a2.length);
        return result;
    }
    
    //<editor-fold defaultstate="collapsed" desc="测试用">
    /*
    public static void main(String[] args) throws IOException {
        BinaryReadWrite bin=new BinaryReadWrite();
        bin.readBinaryStream();
        bin.print();
    }
    * */
    //</editor-fold>
 
    
    public String filename;
    public String version_no;
    public int file_body_len;
    public String mac_code_in;
    public int tot_trans;
    double tot_trans_at;
    
    public ArrayList<TransBody> trans_list;
    
    public String file_tail;
    
    public boolean read_success_flag = false;
    
    private static final String Algorithm = "DESede"; 
    
    public String tmk;
}
