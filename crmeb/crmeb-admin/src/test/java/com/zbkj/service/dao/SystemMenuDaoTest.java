package com.zbkj.service.dao;

import com.zbkj.common.model.system.SystemMenu;
import com.zbkj.service.BaseDaoTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SystemMenuDaoTest extends BaseDaoTest {

    @Autowired
    private SystemMenuDao systemMenuDao;

    @Test
    public void findPermissionByUserId(){
        List<SystemMenu> systemMenuList = systemMenuDao.findPermissionByUserId(1);
        printf(systemMenuList);
    }

    @Test
    public void getMenusByUserId(){
        List<SystemMenu> systemMenuList = systemMenuDao.getMenusByUserId(12);
    }
}
