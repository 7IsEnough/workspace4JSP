package test;

import dao.UserDao;
import domain.User;
import org.junit.Test;

/**
 * @author promise
 * @date 2020/4/3 - 14:40
 */
public class UserDaoTest {
    @Test
    public void testLogin(){
        User loginuser = new User();
        loginuser.setUsername("superbaby");
        loginuser.setPassword("123111");


        UserDao dao = new UserDao();
        User user = dao.login(loginuser);

        System.out.println(user);
    }
}
