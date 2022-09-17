package com.zbkj.service.dao;

import com.zbkj.common.request.ShippingTemplatesFreeRequest;
import com.zbkj.service.BaseDaoTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ShippingTemplatesFreeDaoTest extends BaseDaoTest {

    @Autowired
    ShippingTemplatesFreeDao shippingTemplatesFreeDao;

    @Test
    public void getListGroup(){
        List<ShippingTemplatesFreeRequest> shippingTemplatesFreeRequestList = shippingTemplatesFreeDao.getListGroup(1);
        printf(shippingTemplatesFreeRequestList);
    }
}
