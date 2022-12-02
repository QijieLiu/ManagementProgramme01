package com.manage.Service;

import com.manage.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Edward_Liu
 * @date 2022-11-29 14:49
 */
@Transactional
public interface UserService
{
    /**
     * 储存用户
     * @param user 用户对象
     * @return 返回是否成功
     */
    public boolean userSave(User user);

    /**
     * 更新用户·
     * @param user 用户对象
     * @return 返回是否成功
     */
    public boolean userUpdateAll(User user);

    /**
     * 根据用户名和密码查询用户
     * @param name 用户名
     * @param password 密码
     * @return 返回查询状态
     */
    public boolean userGet(String name, String password);

    /**
     * 查询所有用户
     * @return 返回结果
     */
    public List<User> userGetAll();
}
