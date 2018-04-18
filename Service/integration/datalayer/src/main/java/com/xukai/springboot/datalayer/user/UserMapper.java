package com.xukai.springboot.datalayer.user;

import com.xukai.springboot.entity.user.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 获取全部人员信息
      * @return
     */
   @Select("select userID,loginName,realName,Contact, statue,level,regTime from users")
   @Results({
           @Result(property = "userID",column = "userID"),
           @Result(property = "loginName",column = "loginName"),
           @Result(property = "realName",column = "realName"),
           @Result(property = "Contact",column = "Contact"),
           @Result(property = "statue",column = "statue"),
           @Result(property = "level",column = "level"),
           @Result(property = "regTime",column = "regTime")
   })
   List<User> getAll();

    /**
     * 登录验证
     * @param loginName
     * @param password
     * @return
     */
    @Select("select userID,loginName,realName,Contact, statue,level,regTime from users where loginName=#{loginName} and password=#{password}")
    @Results({
            @Result(property = "userID",column = "userID"),
            @Result(property = "loginName",column = "loginName"),
            @Result(property = "realName",column = "realName"),
            @Result(property = "Contact",column = "Contact"),
            @Result(property = "statue",column = "statue"),
            @Result(property = "level",column = "level"),
            @Result(property = "regTime",column = "regTime")
    })
   User loginCheck(@Param("loginName")String loginName,@Param("password")String password);
}
