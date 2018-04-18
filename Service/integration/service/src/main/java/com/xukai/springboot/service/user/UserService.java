package com.xukai.springboot.service.user;

import com.xukai.springboot.datalayer.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xukai.springboot.entity.user.*;

import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserMapper userMapper;

    /**
     * 获取全部人员信息
     * @return
     */
    public List<User> getAll()
    {
        List<User> users=userMapper.getAll();
        return  users;
    }

    /**
     * 登录认证
     * @param loginName 登录名称
     * @param password 登录密码
     * @return
     */
    public  User LoginCheck(String loginName,String password)
    {
        User user=userMapper.loginCheck(loginName,password);
        return user;
    }
}
