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
}
