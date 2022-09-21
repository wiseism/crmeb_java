package com.zbkj.service.dao;

import com.zbkj.service.BaseDaoTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class StoreOrderStatusDaoTest extends BaseDaoTest {

    @Autowired
    private StoreOrderStatusDao storeOrderStatusDao;

    @Test
    public void getRefundOrderAmountByDate(){
        BigDecimal bigDecimal = storeOrderStatusDao.getRefundOrderAmountByDate("");
    }
}
