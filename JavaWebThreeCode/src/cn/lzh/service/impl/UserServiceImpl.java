package cn.lzh.service.impl;

import cn.lzh.dao.UserDao;
import cn.lzh.dao.impl.UserDaoImpl;
import cn.lzh.domain.User;
import cn.lzh.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        //调用Dao完成查询
        return dao.findAll();
    }
}
