package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Mr.PanYang on 2018/4/24.
 */
@Controller
public class IndexController {


    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/helloworld")
    public ModelAndView helloWorld() {
        ModelAndView mv = new ModelAndView("ftl/hello");
        mv.addObject("words", "hello你好,world!世界!");
        mv.addObject("userList", getUserList());
        return mv;
    }

    public List<User> prepareUserList() {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User item = new User();
            item.setUserName("用户" + i);
            item.setCreateTime(new Date());
            list.add(item);
        }
        return list;
    }

    public List<User> getUserList() {
        return userService.getUserList(0, 5);
    }


}
