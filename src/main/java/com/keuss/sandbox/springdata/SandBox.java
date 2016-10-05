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
        UserService us = (UserService) ctx.getBean("userService");

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

        // Thirdparty TEST ----------------------

        Thirdparty tpPP = new PP();
        tpPP.setMarket("ppmarket");
        tpPP.setName("ppname");
        //us.create(tpPP);

        if (us.findByMarket("ppmarket") instanceof PP)
            LOGGER.info("tp is instanceof PP");

        Thirdparty tpPM = new PM();
        tpPM.setMarket("pmmarket");
        tpPM.setSiren("123456789");
        //us.create(tpPM);

        if (us.findByMarket("pmmarket") instanceof PM)
            LOGGER.info("tp is instanceof PM");

        us.findAllThirdparty().iterator().forEachRemaining(tp -> {
            LOGGER.info(tp.toString());
            if(tp instanceof PP)
                LOGGER.info("PP {}", tp.getName());
            if(tp instanceof PM)
                LOGGER.info("PM {}", tp.getSiren());
        });
    }

}
