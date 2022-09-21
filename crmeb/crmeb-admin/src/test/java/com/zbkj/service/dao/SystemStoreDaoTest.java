package com.zbkj.service.dao;

import com.zbkj.common.request.StoreNearRequest;
import com.zbkj.common.vo.SystemStoreNearVo;
import com.zbkj.service.BaseDaoTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SystemStoreDaoTest extends BaseDaoTest {

    @Autowired
    private SystemStoreDao systemStoreDao;

    @Test
    public void getNearList(){
        StoreNearRequest storeNearRequest = new StoreNearRequest();
        storeNearRequest.setLatitude("1");
        storeNearRequest.setLongitude("2");
        List<SystemStoreNearVo> systemStoreNearVoList = systemStoreDao.getNearList(storeNearRequest);
        printf(systemStoreNearVoList);
    }

}
