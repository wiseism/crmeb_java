package com.zbkj.service.dao;

import com.zbkj.common.request.ShippingTemplatesRegionRequest;
import com.zbkj.service.BaseDaoTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ShippingTemplatesRegionDaoTest extends BaseDaoTest {

    @Autowired
    ShippingTemplatesRegionDao shippingTemplatesRegionDao;

    @Test
    public void getListGroup(){
        List<ShippingTemplatesRegionRequest> shippingTemplatesRegionRequestList = shippingTemplatesRegionDao.getListGroup(1);
        printf(shippingTemplatesRegionRequestList);
    }
}
