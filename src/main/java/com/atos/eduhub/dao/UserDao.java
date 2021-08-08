package com.atos.eduhub.dao;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.User;

@Component

public interface UserDao {

    public int addUser(User newUser);

    public int updateUser(int id, User updUser);

    public int deleteUser(int id);

    public int deleteAllUsers( );

    public List<Map<String, Object>> getAllUser();

    public User getUserById(int id);


}
