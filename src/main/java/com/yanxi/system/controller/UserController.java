package com.yanxi.system.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yanxi.common.model.dto.ResponseResult;
import com.yanxi.system.entity.User;
import com.yanxi.system.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/system/user")
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("/list")
    public ResponseResult list(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
                               @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, User user) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> list = userService.selectUserByCondition(user);
        PageInfo<User> page = new PageInfo<>(list);
        return ResponseResult.okResult(page);
    }
    @PutMapping("/add")
    public ResponseResult addUser(@RequestBody User user) {
        return ResponseResult.okResult(userService.addUser(user));
    }

    @PutMapping("/edit")
    public ResponseResult updateUser(@RequestBody User user) {
        return ResponseResult.okResult(userService.updateUser(user));
    }

    @DeleteMapping("/del")
    public ResponseResult delUser(@RequestParam Long userId) {
        return ResponseResult.okResult(userService.delUser(userId));
    }
}
