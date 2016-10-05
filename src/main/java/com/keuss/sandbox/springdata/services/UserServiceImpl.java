package com.keuss.sandbox.springdata.services;

import com.keuss.sandbox.springdata.entities.PP;
import com.keuss.sandbox.springdata.entities.Thirdparty;
import com.keuss.sandbox.springdata.entities.User;
import com.keuss.sandbox.springdata.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by galloisg on 26/07/2016.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    protected UserRepository userRepository;

    @Autowired
    protected ThirdpartyRepository thirdpartyRepository;

    @Override
    public List<User> findAll() {
        LOGGER.debug("Call findAll");
        return userRepository.findAll();
    }

    @Override
    public User create(User u) {
        LOGGER.debug("Call create with {}", u);
        return userRepository.save(u);
    }

    @Override
    @Transactional
    public void testComplexCreate(User u1, User u2) {
        userRepository.save(u1);
        LOGGER.debug("create with {} ok", u1);
        if (true)
            throw new RuntimeException("Error testComplexCreate");

    }

    @Override
    public Thirdparty create(Thirdparty tp) {
        LOGGER.debug("Call create with {}", tp);
        return thirdpartyRepository.save(tp);
    }

    @Override
    public Thirdparty findByMarket(String market) {
        LOGGER.debug("findByMarket with {}", market);
        return thirdpartyRepository.findByMarket(market);
    }

    @Override
    public Iterable<Thirdparty> findAllThirdparty() {
        LOGGER.debug("Call findAllThirdparty");
        return thirdpartyRepository.findAll();
    }
}
