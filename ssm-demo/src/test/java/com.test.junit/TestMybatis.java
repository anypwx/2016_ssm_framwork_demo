package com.test.junit;


import com.alibaba.fastjson.JSON;
import com.ssm.test.domain.User;
import com.ssm.test.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.annotation.security.RunAs;

/**
 * Created by Administrator on 2016/10/10.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMybatis {
    private static Logger logger = Logger.getLogger(TestMybatis.class);

    @Resource
    private IUserService userService = null;

    @Test
    public void test1(){
        User user = userService.getUserById(1);
        logger.info(JSON.toJSONString(user));
    }
}
