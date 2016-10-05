package com.keuss.sandbox.springdata.services;

import com.keuss.sandbox.springdata.entities.Thirdparty;
import com.keuss.sandbox.springdata.entities.User;

import java.util.List;

/**
 * Created by galloisg on 26/07/2016.
 */
public interface UserService {

   List<User> findAll();

   User create(User u);

   void testComplexCreate(User u1, User u2);

   Thirdparty create(Thirdparty tp);

   Thirdparty findByMarket(String market);

   Iterable<Thirdparty> findAllThirdparty();
}
