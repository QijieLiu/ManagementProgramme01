package com.manage.Service;

import com.manage.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Edward_Liu
 * @date 2022-11-29 14:49
 */
@Service
public interface BookService
{
    /**
     * 保存
     * @param book book对象
     * @return
     */
    public boolean bookSave(Book book);

    /**
     * 修改
     * @param book book对象
     * @return
     */
    public boolean bookUpdate(Book book);

    /**
     * 按id删除
     * @param id book id
     * @return 返回操作结果
     */
    public boolean bookDelete(Integer id);

    /**
     * 按id查询
     * @param id book id
     * @return 返回查询的书本
     */
    public Book bookGetById(Integer id);

    /**
     * 查询全部
     * @return 返回查询集合
     */
    public List<Book> bookGetAll();
}
