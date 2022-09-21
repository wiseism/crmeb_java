package com.zbkj.service.dao;

import com.github.pagehelper.PageHelper;
import com.zbkj.common.request.StoreOrderStaticsticsRequest;
import com.zbkj.common.response.StoreStaffDetail;
import com.zbkj.service.BaseDaoTest;
import com.zbkj.service.dao.StoreOrderDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArticleDaoTest extends BaseDaoTest {

    @Autowired
    private StoreOrderDao articleDao;

    @Test
    public void getTotalPrice(){
        articleDao.getTotalPrice("");
    }

    @Test
    public void getOrderVerificationDetail(){
        StoreOrderStaticsticsRequest request = new StoreOrderStaticsticsRequest();
        request.setPage(1);
        request.setLimit(10);
        request.setDateLimit("");
        request.setStartTime("");
        request.setEndTime("");

        List<StoreStaffDetail> storeStaffDetailList = articleDao.getOrderVerificationDetail(request);

        printf(storeStaffDetailList);
    }
}
