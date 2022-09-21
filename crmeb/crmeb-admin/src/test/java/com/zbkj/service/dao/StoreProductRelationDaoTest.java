package com.zbkj.service.dao;

import com.zbkj.common.response.UserRelationResponse;
import com.zbkj.service.BaseDaoTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StoreProductRelationDaoTest extends BaseDaoTest {

    @Autowired
    private StoreProductRelationDao storeProductRelationDao;

    @Test
    public void getUserList(){
        List<UserRelationResponse> userRelationResponseList = storeProductRelationDao.getUserListByType(1,2);
        printf(userRelationResponseList);
    }
}
