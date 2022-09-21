package com.zbkj.service.dao;

import com.zbkj.service.BaseDaoTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserVisitRecordDaoTest extends BaseDaoTest {

    @Autowired
    private UserVisitRecordDao userVisitRecordDao;

    @Test
    public void getActiveUserNumByDate(){
        userVisitRecordDao.getActiveUserNumByDate("");
    }
    @Test
    public void getActiveUserNumByPeriod(){
        userVisitRecordDao.getActiveUserNumByPeriod("","");
    }
}
