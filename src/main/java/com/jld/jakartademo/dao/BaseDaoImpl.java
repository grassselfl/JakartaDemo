package com.jld.jakartademo.dao;

import com.jld.jakartademo.utils.DBUtils;

import java.sql.ResultSet;

public class BaseDaoImpl implements IBaseDao {
    @Override
    public String findReplayMsgByMsg(String msg) throws Exception {
        String result = "";
        ResultSet resultSet = DBUtils.executeQuery("select replymsg from basetable where msg ='" + msg + "'");

        if (resultSet.next()) result += resultSet.getString("replymsg");
        return result;
    }

    private String replyMessage(String msg) {
        if (msg == null || msg.equals("")) return "";
        String replyMessage = "";
        switch (msg) {
            case "hello":
                replyMessage = "world";
                break;
            case "1":
                replyMessage = "2";
                break;
        }
        return replyMessage;
    }
}
