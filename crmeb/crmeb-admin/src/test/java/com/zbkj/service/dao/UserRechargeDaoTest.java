package com.zbkj.service.dao;

import com.zbkj.service.BaseDaoTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRechargeDaoTest extends BaseDaoTest {

    @Autowired
    private UserRechargeDao userRechargeDao;
    @Test
    public void getSumByType(){
        userRechargeDao.getSumByType("");
    }

    @Test
    public void getSumByRefund(){
        userRechargeDao.getSumByRefund();
    }
}
