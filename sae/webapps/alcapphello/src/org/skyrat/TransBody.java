/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.skyrat;

import java.util.*;

/**
 *
 * @author zts
 */
public class TransBody {
    int len;
    String term_id;
    String mercht_id;
    String sys_tra_no;
    String local_trans_time;
    String local_trans_date;
    String trans_header;
    String trans_tp;
    byte[] trans_bitmap;
    String trans_bitmapStr;
    int card_no_len;
    String card_no;
    String trans_proc_cd;
    double trans_at;
    String card_exp_date;
    String service_entry_md_cd;
    String card_seq_no;
    String service_cond_cd;
    String pos_pin_capt_cd;
    String trans_currency_cd;
    
    int ic_data_len;
    HashMap<String,TLV> F55;
    
    int F60_len;
    String F60_1;
    String F60_2;
    String F60_3;
    String F60_4;
    String F60_5;
    int F63_len;
    String F63_1;
    
    String MAC;
    
    public TransBody(){
        this.F55 = new HashMap();
        this.F55.put("9F26", new TLV("9F26",8,"",0));
        this.F55.put("9F27", new TLV("9F27",1,"",0));
        this.F55.put("9F10", new TLV("9F10",0,"",0));
        this.F55.put("9F37", new TLV("9F37",4,"",0));
        this.F55.put("9F36", new TLV("9F36",2,"",0));
        this.F55.put("95", new TLV("95",5,"",0));
        this.F55.put("9A", new TLV("9A",3,"",1));
        this.F55.put("9C", new TLV("9C",1,"",1));
        this.F55.put("9F02", new TLV("9F02",6,"",1));
        this.F55.put("5F2A", new TLV("5F2A",2,"",1));
        this.F55.put("82", new TLV("82",2,"",0));
        this.F55.put("9F1A", new TLV("9F1A",2,"",1));
        this.F55.put("9F03", new TLV("9F03",6,"",1));
        this.F55.put("9F33", new TLV("9F33",3,"",0));
        this.F55.put("9F1E", new TLV("9F1E",8,"",2));
        this.F55.put("84", new TLV("84",0,"",0));
        this.F55.put("9F09", new TLV("9F09",2,"",0));
        this.F55.put("9F41", new TLV("9F41",0,"",1));
        this.F55.put("9F34", new TLV("9F34",3,"",0));
        this.F55.put("9F35", new TLV("9F35",1,"",1));
        this.F55.put("9F63", new TLV("9F63",16,"",0));
        this.F55.put("9F74", new TLV("9F74",6,"",2));
        this.F55.put("8A", new TLV("8A",2,"",2));
    }

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public String getTerm_id() {
		return term_id;
	}

	public void setTerm_id(String term_id) {
		this.term_id = term_id;
	}

	public String getMercht_id() {
		return mercht_id;
	}

	public void setMercht_id(String mercht_id) {
		this.mercht_id = mercht_id;
	}

	public String getSys_tra_no() {
		return sys_tra_no;
	}

	public void setSys_tra_no(String sys_tra_no) {
		this.sys_tra_no = sys_tra_no;
	}

	public String getLocal_trans_time() {
		return local_trans_time;
	}

	public void setLocal_trans_time(String local_trans_time) {
		this.local_trans_time = local_trans_time;
	}

	public String getLocal_trans_date() {
		return local_trans_date;
	}

	public void setLocal_trans_date(String local_trans_date) {
		this.local_trans_date = local_trans_date;
	}

	public String getTrans_header() {
		return trans_header;
	}

	public void setTrans_header(String trans_header) {
		this.trans_header = trans_header;
	}

	public String getTrans_tp() {
		return trans_tp;
	}

	public void setTrans_tp(String trans_tp) {
		this.trans_tp = trans_tp;
	}

	public byte[] getTrans_bitmap() {
		return trans_bitmap;
	}

	public void setTrans_bitmap(byte[] trans_bitmap) {
		this.trans_bitmap = trans_bitmap;
	}

	public int getCard_no_len() {
		return card_no_len;
	}

	public void setCard_no_len(int card_no_len) {
		this.card_no_len = card_no_len;
	}

	public String getCard_no() {
		return card_no;
	}

	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}

	public String getTrans_proc_cd() {
		return trans_proc_cd;
	}

	public void setTrans_proc_cd(String trans_proc_cd) {
		this.trans_proc_cd = trans_proc_cd;
	}

	public double getTrans_at() {
		return trans_at;
	}

	public void setTrans_at(double trans_at) {
		this.trans_at = trans_at;
	}

	public String getCard_exp_date() {
		return card_exp_date;
	}

	public void setCard_exp_date(String card_exp_date) {
		this.card_exp_date = card_exp_date;
	}

	public String getService_entry_md_cd() {
		return service_entry_md_cd;
	}

	public void setService_entry_md_cd(String service_entry_md_cd) {
		this.service_entry_md_cd = service_entry_md_cd;
	}

	public String getCard_seq_no() {
		return card_seq_no;
	}

	public void setCard_seq_no(String card_seq_no) {
		this.card_seq_no = card_seq_no;
	}

	public String getService_cond_cd() {
		return service_cond_cd;
	}

	public void setService_cond_cd(String service_cond_cd) {
		this.service_cond_cd = service_cond_cd;
	}

	public String getPos_pin_capt_cd() {
		return pos_pin_capt_cd;
	}

	public void setPos_pin_capt_cd(String pos_pin_capt_cd) {
		this.pos_pin_capt_cd = pos_pin_capt_cd;
	}

	public String getTrans_currency_cd() {
		return trans_currency_cd;
	}

	public void setTrans_currency_cd(String trans_currency_cd) {
		this.trans_currency_cd = trans_currency_cd;
	}

	public int getIc_data_len() {
		return ic_data_len;
	}

	public void setIc_data_len(int ic_data_len) {
		this.ic_data_len = ic_data_len;
	}

	public HashMap<String, TLV> getF55() {
		return F55;
	}

	public void setF55(HashMap<String, TLV> f55) {
		F55 = f55;
	}

	public int getF60_len() {
		return F60_len;
	}

	public void setF60_len(int f60_len) {
		F60_len = f60_len;
	}

	public String getF60_1() {
		return F60_1;
	}

	public void setF60_1(String f60_1) {
		F60_1 = f60_1;
	}

	public String getF60_2() {
		return F60_2;
	}

	public void setF60_2(String f60_2) {
		F60_2 = f60_2;
	}

	public String getF60_3() {
		return F60_3;
	}

	public void setF60_3(String f60_3) {
		F60_3 = f60_3;
	}

	public String getF60_4() {
		return F60_4;
	}

	public void setF60_4(String f60_4) {
		F60_4 = f60_4;
	}

	public String getF60_5() {
		return F60_5;
	}

	public void setF60_5(String f60_5) {
		F60_5 = f60_5;
	}

	public int getF63_len() {
		return F63_len;
	}

	public void setF63_len(int f63_len) {
		F63_len = f63_len;
	}

	public String getF63_1() {
		return F63_1;
	}

	public void setF63_1(String f63_1) {
		F63_1 = f63_1;
	}

	public String getMAC() {
		return MAC;
	}

	public void setMAC(String mAC) {
		MAC = mAC;
	}

	public String getTrans_bitmapStr() {
		return new String(trans_bitmap);
	}
}
