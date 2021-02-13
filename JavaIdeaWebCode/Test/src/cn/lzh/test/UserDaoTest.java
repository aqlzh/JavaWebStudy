package cn.lzh.test;

import cn.lzh.dao.userdao;
import cn.lzh.domain.User;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void testLogin(){
        User loginuser = new User();
        loginuser.setUsername("zhangsan") ;
        loginuser.setPassword("123");

        userdao dao = new userdao();
        User user = dao.login(loginuser);

        System.out.println(user);
    }

}
