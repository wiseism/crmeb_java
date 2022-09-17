package com.zbkj.service.dao;

import com.zbkj.common.vo.UserFundsMonitor;
import com.zbkj.service.BaseDaoTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

public class UserFundsMonitorDaoTest extends BaseDaoTest {

    @Autowired
    UserFundsMonitorDao userFundsMonitorDao;

    @Test
    public void getFundsMonitor(){
        UserFundsMonitor userFundsMonitor = userFundsMonitorDao.getFundsMonitor(new HashMap<>());
        printf(userFundsMonitor);
    }
}
