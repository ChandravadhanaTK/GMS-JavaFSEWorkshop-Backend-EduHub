package com.atos.eduhub.dao.impl;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.atos.eduhub.configuration.QueryConfig;

import com.atos.eduhub.dao.UserDao;
import com.atos.eduhub.model.User;
import com.atos.eduhub.rowmapper.UserRowMapper;


@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Map<String, Object>> getAllUser(){
        return jdbcTemplate.queryForList(QueryConfig.userprofile_fetchAll);

    }

    public List<User> getAllWithRowMapper() {
        return jdbcTemplate.query(QueryConfig.userprofile_fetchAll,new UserRowMapper());
    }


    @Override
    public User getUserById(int id) {
        return jdbcTemplate.queryForObject(QueryConfig.userprofile_fetchById, new UserRowMapper(),new Object[] {id} );
       
    }

    @Override
    public int addUser(User newUser) {

        return	jdbcTemplate.update(QueryConfig.userprofile_save,newUser.getId(),newUser.getUserName(),newUser.getPassword(),newUser.getFirstName(),newUser.getSecondName(),newUser.getEmailId(),newUser.getMobile(),newUser.getLocation()
                ,newUser.getDesignation(),newUser.getExperience(),newUser.getPrimarySkills(),newUser.getSecondarySkills(),newUser.getRole(),LocalDateTime.now(),LocalDateTime.now());

    }

    @Override
    public int deleteUser(int id) {
        return jdbcTemplate.update(QueryConfig.userprofile_deleteById,id);
    }

    @Override
    public int deleteAllUsers( ) {
        return jdbcTemplate.update(QueryConfig.userprofile_deleteAll);
    }

    @Override
    public int updateUser(int id, User updUser) {

        System.out.println(updUser);
        return	jdbcTemplate.update(QueryConfig.userprofile_updateById,updUser.getUserName(),updUser.getPassword(),updUser.getFirstName(),updUser.getSecondName(),updUser.getEmailId(),updUser.getMobile(),updUser.getLocation(),updUser.getDesignation(),updUser.getExperience(),updUser.getPrimarySkills(),updUser.getSecondarySkills(),updUser.getRole(),updUser.getCreatedOn(),updUser.getLastLogin(),id);

    }

}


