package com.zbkj.service.dao;

import com.zbkj.common.request.StoreOrderStaticsticsRequest;
import com.zbkj.common.response.StoreStaffDetail;
import com.zbkj.service.BaseDaoTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StoreOrderDaoTest extends BaseDaoTest {

    @Autowired
    private StoreOrderDao storeOrderDao;

    @Test
    public void getTotalPrice(){
        storeOrderDao.getTotalPrice("");
    }

    @Test
    public void getOrderVerificationDetail(){
        StoreOrderStaticsticsRequest request = new StoreOrderStaticsticsRequest();
        List<StoreStaffDetail> storeStaffDetailList =  storeOrderDao.getOrderVerificationDetail(request);
        printf(storeStaffDetailList);
    }

}
