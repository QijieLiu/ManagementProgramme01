package com.manage.dao;

import com.manage.domain.Book;
import com.manage.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Edward_Liu
 * @date 2022-11-29 14:27
 */
@Mapper
public interface UserDao
{
    /**
     * 保存用户输入的数据
     * @param user 将用户数据封装成对象
     * @return 返回数值表示是否成功
     */
    @Insert("insert into user (name, password) values(#{name},#{password})")
    public int userSave(User user);

    /**
     * 用户修改密码
     * @param user 用户数据对象
     * @return 返回数值表示是否成功
     */
    @Update("update user set password = #{password}  where name = #{name}")
    public int userUpdateAll(User user);

    /**
     * 根据用户姓名查询
     * @param name 查询值
     * @param password  密码
     * @return 返回查询状态
     */
    @Select("select * from user where name = #{name} and password = #{password}")
    public int userGet(String name, String password);

    /**
     * 查询所有用户
     * @return 返回查询状态
     */
    @Select("select * from user")
    public List<User> userGetAll();


}
