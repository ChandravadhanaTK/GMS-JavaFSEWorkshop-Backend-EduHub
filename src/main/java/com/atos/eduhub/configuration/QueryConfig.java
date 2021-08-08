package com.atos.eduhub.configuration;

public final class QueryConfig {

    public static final String userprofile_fetchAll="select id,userName,password,firstName,secondName,emailID,mobile,location,designation,experience,primarySkills,secondarySkills,role,createdOn,lastLogin from user_profile";
    public static final String userprofile_fetchById="select id,userName,password,firstName,secondName,emailID,mobile,location,designation,experience,primarySkills,secondarySkills,role,createdOn,lastLogin from user_profile where id=?";
    public static final String userprofile_deleteById="delete from  user_profile where  id=?";
    public static final String userprofile_updateById="update  user_profile set userName=?,password=?,firstName=?,secondName=?,emailID=?,mobile=?,location=?,designation=?,experience=?,primarySkills=?,secondarySkills=?,role=?,createdOn=?,lastLogin=? where  id=?";
    public static final String userprofile_save="insert into user_profile(id,userName,password,firstName,secondName,emailID,mobile,location,designation,experience,primarySkills,secondarySkills,role,createdOn,lastLogin) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    public static final String userprofile_deleteAll = "delete from user_profile";

    public QueryConfig() {
        // TODO Auto-generated constructor stub
    }

}

