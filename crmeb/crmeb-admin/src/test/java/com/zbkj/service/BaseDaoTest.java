package com.zbkj.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zbkj.admin.CrmebAdminApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CrmebAdminApplication.class)
public abstract class BaseDaoTest {

    @Test
    public void dd(){

    }

    protected void printf(Object o) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            String s = mapper.writeValueAsString(o);

            System.out.println(s);
        }catch (JsonProcessingException e){

        }
    }
}
