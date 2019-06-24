package webMVC.dao.jdbc_template_dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

/**
 * Created by zjb on 2019/6/20.
 */
@Repository
public class JdbcUserRepository {

    @Autowired
    private JdbcOperations jdbcOperations;

    public void updatePassword(String password) {
        String sql = "UPDATE user set USER.password = ?";
        jdbcOperations.update(sql, password);
    }
}
