package com.manage.Controller;

import com.manage.Service.BookService;
import com.manage.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Edward_Liu
 * @date 2022-11-30 12:44
 */
@RestController
@RequestMapping("/books")
public class BookController
{
    @Autowired
    private BookService bookService;

    @PostMapping
    public Result bookSave(@RequestBody Book book)
    {
        boolean flag = bookService.bookSave(book);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result bookUpdate(@RequestBody Book book)
    {
        boolean flag = bookService.bookUpdate(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result bookDelete(@PathVariable Integer id)
    {
        boolean flag = bookService.bookDelete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result bookSelectById(@PathVariable Integer id)
    {
        Book book = bookService.bookGetById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "数据查询失败，请重试";
        return new Result(code, book, msg);
    }

    @GetMapping
    public Result bookGetAll()
    {
        List<Book> bookList = bookService.bookGetAll();
        Integer code = bookList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = bookList != null ? "" : "数据查询失败，请重试！";
        return new Result(code,bookList,msg);
    }
}
