package com.manage.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author Edward_Liu
 * @date 2022-11-29 14:06
 */
@Data
public class User
{
    //用户id
    private Integer id;
    //用户姓名
    private String name;
    //用户密码
    private String password;
}
