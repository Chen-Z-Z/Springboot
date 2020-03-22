package com.chenrui.demo;


import com.alibaba.fastjson.JSON;
import com.chenrui.demo.En.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(value = "/api/User")
public class UserController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(HttpServletRequest request) {
        try {
            List<User> list = new ArrayList<>();
            User user = new User();
            user.setId(1);
            user.setUserName("aa");
            user.setPassword("aaaa");
            list.add(user);
            return JSON.toJSONString(list);
        } catch (Exception e) {
            e.printStackTrace();;
        }
        return "";
    }
}
