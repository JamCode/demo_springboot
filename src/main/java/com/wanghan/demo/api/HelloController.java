package com.wanghan.demo.api;

import com.wanghan.demo.dao.UserMapper;
import com.wanghan.demo.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {

        User u = userMapper.findByName("iDeal_test005");


        logger.info("test traceid");



        System.out.println(u.getUserid());
        System.out.println(u.getPhone_num());


        return "Hello World112221";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {




        return "test";
    }

}
