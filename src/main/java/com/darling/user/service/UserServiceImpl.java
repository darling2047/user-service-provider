package com.darling.user.service;

import com.darling.pubIn.bean.User;
import com.darling.pubIn.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 *   @author 董琳琳
 *   @date 2018/9/28 10:24
 *   @description   用户服务的实现类 这里用来向订单服务提供相关服务
 */
public class UserServiceImpl implements UserService {

    /**
     * 查询用户信息(这里为订单服务的初始化订单接口提供服务)
     * @param userId
     * @return
     */
    @Override
    public List<User> getUserAddressList(String userId) {
        List<User> list = new ArrayList();
        list.add(new User(3,"韦德3","男",36,"迈阿密"));
        list.add(new User(23,"詹姆斯23","男",34,"洛杉矶"));
        list.add(new User(24,"科比24","男",39,"洛杉矶"));
        return list;
    }
}
