package com.jld.jakartademo.service;

import com.jld.jakartademo.dao.BaseDaoImpl;
import com.jld.jakartademo.dao.IBaseDao;

public class BaseServiceImpl implements IBaseService {
    private IBaseDao baseDao;

    @Override
    public String replyMessage(String msg) throws Exception {
        baseDao = new BaseDaoImpl();
        return baseDao.findReplayMsgByMsg(msg);
    }
}
