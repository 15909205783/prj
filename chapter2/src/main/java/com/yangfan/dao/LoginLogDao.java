package com.yangfan.dao;

import com.yangfan.domain.LoginLog;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginLogDao {
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    private final static String INSERT_LOGIN_LOG_SQL = "INSERT INTO" +
            "t_login_log(user_id,ip,login_datatime) values(?,?,?)";

    public void insertLoginLog(LoginLog loginLog) {
        Object[] args = {loginLog.getUserId(), loginLog.getIp(), loginLog.getLoginDate()};
        jdbcTemplate.update(INSERT_LOGIN_LOG_SQL, args);
    }
}
