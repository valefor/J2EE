/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.skyrat;

/**
 *
 * @author zts
 */
public class TLV {
    public String tag;
    public int len;
    public String value;
    public int cd_tp;//编码类型 0-Binary 1-BCD 2-ASCII
    
    public TLV(String tag, int len, String value, int cd_tp){
        this.tag = tag;
        this.len = len;
        this.value = value;
        this.cd_tp = cd_tp;
    }
}
