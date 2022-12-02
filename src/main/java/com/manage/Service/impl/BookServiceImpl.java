package com.manage.Service.impl;

import com.manage.Service.BookService;
import com.manage.dao.BookDao;
import com.manage.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Edward_Liu
 * @date 2022-11-29 14:29
 */
@Service
public class BookServiceImpl implements BookService
{
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean bookSave(Book book)
    {
        return bookDao.bookSave(book) > 0;
    }

    @Override
    public boolean bookUpdate(Book book)
    {
        return bookDao.bookUpdate(book) > 0;
    }

    @Override
    public boolean bookDelete(Integer id)
    {
        return bookDao.bookDelete(id) > 0;
    }

    @Override
    public Book bookGetById(Integer id)
    {
        return bookDao.bookGetById(id);
    }

    @Override
    public List<Book> bookGetAll()
    {
        return bookDao.bookGetAll();
    }
}
