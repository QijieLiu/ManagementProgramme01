package com.manage.dao;

import com.manage.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Edward_Liu
 * @date 2022-11-29 14:27
 */
@Mapper
public interface BookDao
{
    /**
     * 保存书本信息
     *
     * @param book 书本对象
     * @return 返回操作结果
     */
    @Insert("insert into book (name,type,description) values(#{name},#{type},#{description})")
    public int bookSave(Book book);

    /**
     * 更新书本
     *
     * @param book 书本对象
     * @return 返回操作结果
     */
    @Update("update book set name = #{name}, type = #{type}, description = #{description} where id = #{id}")
    public int bookUpdate(Book book);

    /**
     * 删除书本
     *
     * @param id 书本id
     * @return 操作结果
     */
    @Delete("delete from book where id = #{id}")
    public int bookDelete(Integer id);

    /**
     * 根据id查询
     *
     * @param id 书本id
     * @return 返回查询结果
     */
    @Select("select * from book where id = #{id}")
    public Book bookGetById(Integer id);

    /**
     * 查询全部
     *
     * @return 书本list
     */
    @Select("select * from book")
    public List<Book> bookGetAll();
}
