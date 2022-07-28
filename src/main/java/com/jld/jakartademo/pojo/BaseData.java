package com.jld.jakartademo.pojo;

public class BaseData {
    private int id;
    private String msg;
    private String replyMsg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getReplyMsg() {
        return replyMsg;
    }

    public void setReplyMsg(String replyMsg) {
        this.replyMsg = replyMsg;
    }

    public BaseData(int id, String msg, String replyMsg) {
        this.id = id;
        this.msg = msg;
        this.replyMsg = replyMsg;
    }

    @Override
    public String toString() {
        return "BaseData{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", replyMsg='" + replyMsg + '\'' +
                '}';
    }
}