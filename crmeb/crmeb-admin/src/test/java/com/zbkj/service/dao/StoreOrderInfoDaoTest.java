package com.zbkj.service.dao;

import com.zbkj.service.BaseDaoTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class StoreOrderInfoDaoTest extends BaseDaoTest {

    @Autowired
    private StoreOrderInfoDao storeOrderInfoDao;

    @Test
    public void getSalesNumByDateAndProductId(){
        storeOrderInfoDao.getSalesNumByDateAndProductId("",1);
    }

    @Test
    public void dd(){
        storeOrderInfoDao.getSalesByDateAndProductId("",1);
    }
}
