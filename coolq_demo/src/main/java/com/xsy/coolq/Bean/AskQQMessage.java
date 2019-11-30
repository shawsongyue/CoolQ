package com.xsy.coolq.Bean;

/*
* 编写回复用户的javaBean
* */
public class AskQQMessage {
    private String act;
    private String QQID;//对方用户ID
    private String msg;//返回用户信息
    public String getAct() {
        return act;
    }
    public void setAct(String act) {
        this.act = act;
    }
    public String getQQID() {
        return QQID;
    }
    public void setQQID(String qQID) {
        QQID = qQID;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
