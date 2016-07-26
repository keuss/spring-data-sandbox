package com.keuss.sandbox.springdata.repositories;

import com.keuss.sandbox.springdata.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by galloisg on 26/07/2016.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
