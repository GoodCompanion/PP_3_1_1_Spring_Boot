package com.kalinin.spring.app.repository;

import com.kalinin.spring.app.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

}
