package com.atos.eduhub.dao.impl;
import java.util.List;
import java.util.Map;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.atos.eduhub.dao.UserDao;
import com.atos.eduhub.model.User;
import com.atos.eduhub.rowmapper.UserRowMapper;


@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${userprofile_fetchAll}")
    private String fetchAll;
    @Value("${userprofile_fetchById}")
    private String userprofile_fetchById;
    @Value("${userprofile_deleteById}")
    private String userprofile_deleteById;
    @Value("${userprofile_updateById}")
    private String userprofile_updateById;
    @Value("${userprofile_save}")
    private String userprofile_save;

    @Override
    public List<Map<String, Object>> getAllUser(){
        return jdbcTemplate.queryForList(fetchAll);

    }


    public List<User> getAllWithRowMapper() {
        return jdbcTemplate.query(fetchAll,new UserRowMapper());
    }


    @Override
    public User getUserById(int id) {
        return jdbcTemplate.queryForObject(userprofile_fetchById, new UserRowMapper(),new Object[] {id} );
    }

    @Override
    public int addUser(User newUser) {
        return	jdbcTemplate.update(userprofile_save,newUser.getId(),newUser.getUserName(),newUser.getPassword(),newUser.getFirstName(),newUser.getSecondName(),newUser.getEmailId(),newUser.getMobile(),newUser.getLocation()
                ,newUser.getDesignation(),newUser.getExperience(),newUser.getPrimarySkills(),newUser.getSecondarySkills(),newUser.getRole(),newUser.getCreatedOn(),newUser.getLastLogin());

    }

    @Override
    public int deleteUser(int id, User delUser) {
        return jdbcTemplate.update(userprofile_deleteById,delUser.getId());
    }



    @Override
    public int updateUser(int id, User updUser) {


        return	jdbcTemplate.update(userprofile_updateById,updUser.getId(),updUser.getUserName(),updUser.getPassword(),updUser.getFirstName(),updUser.getSecondName(),updUser.getEmailId(),updUser.getMobile(),updUser.getLocation()
                ,updUser.getDesignation(),updUser.getExperience(),updUser.getPrimarySkills(),updUser.getSecondarySkills(),updUser.getRole(),updUser.getCreatedOn(),updUser.getLastLogin());

    }


}


