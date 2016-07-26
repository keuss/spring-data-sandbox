package com.keuss.sandbox.springdata;

import com.keuss.sandbox.springdata.entities.User;
import com.keuss.sandbox.springdata.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by galloisg on 26/07/2016.
 */
public class SandBox {

    private static final Logger LOGGER = LoggerFactory.getLogger(SandBox.class);
    public static void main(String args[]) {
        LOGGER.info("SandBox ...");

        // open/read the application context file
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

        System.out.println(ctx);

        UserService us = (UserService)ctx.getBean("userService");

        // create
        User user = new User();
        user.setName("steve");
        user.setEmail("steve@gmail.com");
        us.create(user);

        // find all
        us.findAll().stream().forEach(u -> LOGGER.info("user : {}", u));
    }

}