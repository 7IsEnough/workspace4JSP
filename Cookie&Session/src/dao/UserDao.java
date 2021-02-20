package dao;

import domain.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtils;


/**
 * @author promise
 * @date 2020/4/22 - 11:18
 * 操作数据库用户表的类
 */
public class UserDao {

    //声明JDBCTemplate对象共用
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    public User login(User loginUser){



        try {
            //1.查询语句
            String sql = "select * from user where username = ? and password = ?";
            //2.调用query方法查询结果
            User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), loginUser.getUsername(), loginUser.getPassword());
            return user;
        }catch (DataAccessException e){
            e.printStackTrace();
            return null;
        }
    }


}
