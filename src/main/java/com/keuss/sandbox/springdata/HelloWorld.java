package com.keuss.sandbox.springdata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by galloisg on 26/07/2016.
 */
public class HelloWorld {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);
    public static void main(String args[]) {
        LOGGER.info("Hello Wordl {}", "keuss !");
    }

}
