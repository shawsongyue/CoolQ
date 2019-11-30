package com.xsy.coolq.Bean;


/*
* 存放用户发送过来的信息
* */
public class QQMessage {
    //---------通用字段---------
    private String nick;         //昵称
    private String sex;                //性别
    private String age;                //年龄
    private String error;         //
    private String act;         //
    private String fromQQ;         //消息来源的帐号
    private String subType;         //消息来源:1是讨论组和群;11是私聊
    private String sendTime;        //消息到达的时间
    private String msg;         //消息内容
    private String font;         //
    //---------讨论组消息专有字段---------
    private String fromDiscuss;
    //---------群消息专有字段---------
    private String username;
    private String fromAnonymous;
    private String fromGroup;        //群帐号
    private String fromGroupName;
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public String getAct() {
        return act;
    }
    public void setAct(String act) {
        this.act = act;
    }
    public String getFromQQ() {
        return fromQQ;
    }
    public void setFromQQ(String fromQQ) {
        this.fromQQ = fromQQ;
    }
    public String getSubType() {
        return subType;
    }
    public void setSubType(String subType) {
        this.subType = subType;
    }
    public String getSendTime() {
        return sendTime;
    }
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getFont() {
        return font;
    }
    public void setFont(String font) {
        this.font = font;
    }
    public String getFromDiscuss() {
        return fromDiscuss;
    }
    public void setFromDiscuss(String fromDiscuss) {
        this.fromDiscuss = fromDiscuss;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getFromAnonymous() {
        return fromAnonymous;
    }
    public void setFromAnonymous(String fromAnonymous) {
        this.fromAnonymous = fromAnonymous;
    }
    public String getFromGroup() {
        return fromGroup;
    }
    public void setFromGroup(String fromGroup) {
        this.fromGroup = fromGroup;
    }
    public String getFromGroupName() {
        return fromGroupName;
    }
    public void setFromGroupName(String fromGroupName) {
        this.fromGroupName = fromGroupName;
    }
}
