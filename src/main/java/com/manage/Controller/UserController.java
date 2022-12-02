package com.manage.Controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.manage.Service.UserService;
import com.manage.domain.User;
import org.apache.naming.EjbRef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Edward_Liu
 * @date 2022-11-30 12:44
 */
@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @PostMapping
    public Result userSave(@RequestBody User user)
    {
        boolean flag = userService.userSave(user);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result userUpdate(@RequestBody User user)
    {
        boolean flag = userService.userUpdateAll(user);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @GetMapping("/{name}/{password}")
    public Result userGet(@PathVariable String name, @PathVariable String password)
    {
        boolean flag = userService.userGet(name, password);
        return new Result(flag ? Code.GET_OK:Code.GET_ERR,flag);
    }

    @GetMapping
    public Result userGetAll()
    {
        List<User> users = userService.userGetAll();
        Integer code = users != null ? Code.GET_OK : Code.GET_ERR;
        String msg = users != null ? "" : "数据查询失败，请重试！";
        return new Result(code,users,msg);
    }
}
