package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Mr.PanYang on 2018/4/24.
 */
@Controller
public class IndexController {


    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/userlist")
    public ModelAndView helloWorld(Integer offset, Integer limit) {
        offset = offset == null ? 0 : offset;//默认便宜0
        limit = limit == null ? 50 : limit;//默认展示50条
        ModelAndView mv = new ModelAndView("ftl/hello");
        mv.addObject("headObj", "用户列表");
        List<User> userList = userService.getUserList(offset, limit);
        mv.addObject("userList", userList);
        return mv;
    }

//    public List<User> prepareUserList() {
//        List<User> list = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            User item = new User();
//            item.setUserName("用户" + i);
//            item.setCreateTime(new Date());
//            list.add(item);
//        }
//        return list;
//    }


}
