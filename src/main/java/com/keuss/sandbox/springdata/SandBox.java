package com.keuss.sandbox.springdata;

import com.keuss.sandbox.springdata.entities.PM;
import com.keuss.sandbox.springdata.entities.PP;
import com.keuss.sandbox.springdata.entities.Thirdparty;
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
        UserService us = (UserService)ctx.getBean("userService");

        // create
        User user = new User();
        user.setName("steve");
        user.setEmail("steve@gmail.com");
       // us.create(user);

        // find all
        //us.findAll().stream().forEach(u -> LOGGER.info("user : {}", u));

        // stupid test for transaction
        User user1 = new User();
        user1.setName("bill");
        user1.setEmail("bill@gmail.com");

        User user2 = new User();
        user2.setName("lynn");
        user2.setEmail("lynn@gmail.com");

        //us.testComplexCreate(user1, user2);

        // Thirdparty TEST
        PP pp = new PP();
        pp.setName("ppname");
        pp.setMarket("ppmarket");
        //us.createPP(pp);

        Thirdparty tp = us.findByMarket("ppmarket");
        if(tp instanceof PP)
           LOGGER.info("tp is instanceof PP");

        Thirdparty tpPM = new PM();
        tpPM.setMarket("pmmarket");
        tpPM.setSiren("123456789");
        //us.create(tpPM);

        Thirdparty tp2 = us.findByMarket("pmmarket");
        if(tp2 instanceof PM)
            LOGGER.info("tp2 is instanceof PM {}", tp2.getSiren());
    }

}
