package com.astontech.simplewebapp;

import com.astontech.simplewebapp.domain.User;
import com.astontech.simplewebapp.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.IntStream;

@SpringBootApplication
public class SimplewebappApplication implements CommandLineRunner {

    private static Logger LOG = LoggerFactory
            .getLogger(SimplewebappApplication.class);

    @Autowired
    UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(SimplewebappApplication.class, args);
    }

    @Override
    public void run(String... args) {
        IntStream.rangeClosed(1, 10).forEach(i -> {
            User user = new User();
            user.setName("User" + i);
            userService.saveUser(user);
            LOG.info(user.getName() + " Saved to Database");
        });
    }

}
