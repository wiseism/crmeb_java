package com.zbkj.service.dao;

import com.zbkj.service.BaseDaoTest;
import com.zbkj.service.dao.StoreOrderDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ArticleDaoTest extends BaseDaoTest {

    @Autowired
    private StoreOrderDao articleDao;

    @Test
    public void getTotalPrice(){
        articleDao.getTotalPrice("");
    }
}
