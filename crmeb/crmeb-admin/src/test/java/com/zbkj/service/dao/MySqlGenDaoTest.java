package com.zbkj.service.dao;

import com.zbkj.service.BaseDaoTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class MySqlGenDaoTest extends BaseDaoTest {

    @Autowired
    private MySqlGenDao mySqlGenDao;

    @Test
    public void getList(){
        Map<String, Object> map = new HashMap<>();
        mySqlGenDao.getList(map);
    }

    @Test
    public void getTable(){
        mySqlGenDao.getTable("");
    }

    @Test
    public void getColumns(){
        mySqlGenDao.getColumns("");
    }
}
