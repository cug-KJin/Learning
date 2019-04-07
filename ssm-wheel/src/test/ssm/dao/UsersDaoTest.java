package ssm.dao;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssm.entity.Users;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration( "classpath:spring/spring-dao.xml")

public class UsersDaoTest{
    @Autowired
    private UsersDao usersDao;
    @Test
    public void insertUser() {
        int insertcount = usersDao.insertUser(4,"J","123456");
        System.out.println("insertcount"+insertcount);
    }

    @Test
    public void getUserByID() {
        int id = 4;
        Users users = usersDao.getUserByID(id);
        System.out.println(users.toString());
    }
    @Test
    public void updatePasswordByID() {
        int updatecount = usersDao.updatePasswordByID(2,"123");
        System.out.println("updatecount"+updatecount);
    }
}