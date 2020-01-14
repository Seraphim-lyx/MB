package com.mybatis.mybatis.mapper;

import com.mybatis.mybatis.dao.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

@Mapper
public interface UserMapper {

    @SelectProvider(type = UserDaoProvider.class, method = "findUser")
    public List<User> getUser() throws Exception;

    @Insert("insert into client_command values (default, #{name})")
    public void insertUser(User user) throws Exception;


    class UserDaoProvider{
        public String findUser(){
            return new SQL(){{
                SELECT("*");
                FROM("client_command");
            }}.toString();
        }
    }
}
