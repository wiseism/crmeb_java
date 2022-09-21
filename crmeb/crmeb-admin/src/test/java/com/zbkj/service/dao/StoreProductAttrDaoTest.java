package com.zbkj.service.dao;

import com.zbkj.common.model.product.StoreProductAttr;
import com.zbkj.service.BaseDaoTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class StoreProductAttrDaoTest extends BaseDaoTest {

    @Autowired
    private StoreProductAttrDao storeProductAttrDao;

    @Test
    public void updateByProductId(){
        StoreProductAttr storeProductAttr = new StoreProductAttr();
        storeProductAttrDao.updateByProductId(storeProductAttr);
    }
}
