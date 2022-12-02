package com.manage.domain;

import lombok.Data;

/**
 * @author Edward_Liu
 * @date 2022-11-29 14:11
 */
@Data
public class Book
{
    //图书编号
    private Integer id;
    //图书名称
    private String name;
    //图书类型
    private String type;
    //图书描述
    private String description;
}
