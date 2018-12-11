package com.astontech.simplewebapp.repositories;

import com.astontech.simplewebapp.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByName(String name);
}
