package com.ssm.test.service.impl;

import com.ssm.test.dao.UserMapper;
import com.ssm.test.domain.User;
import com.ssm.test.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/10/10.
 */

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userDao;

    public User getUserById(int userid) {
        return this.userDao.selectByPrimaryKey(userid);
    }
}
