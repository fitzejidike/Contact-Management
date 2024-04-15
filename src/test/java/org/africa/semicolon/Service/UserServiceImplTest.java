package org.africa.semicolon.Service;

import org.africa.semicolon.Data.Repositories.UserRepository;
import org.africa.semicolon.Dtos.Requests.LoginRequest;
import org.africa.semicolon.Dtos.Requests.RegisterUserRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;


    @Test
    void test_to_registerUser() {
        RegisterUserRequest registerUserRequest = new RegisterUserRequest();
        registerUserRequest.setFirstname("fitz");
        registerUserRequest.setLastname("leo");
        registerUserRequest.setNumber("09150429906");
        registerUserRequest.setEmail("fitz@email.com");
        registerUserRequest.setPassword("1234");
        registerUserRequest.setUsername("leo19");
        userService.registerUser(registerUserRequest);
        assertEquals(1,userRepository.count());


    }

    @Test
    void test_to_login() {
        RegisterUserRequest registerUserRequest = new RegisterUserRequest();
        registerUserRequest.setFirstname("fitz");
        registerUserRequest.setLastname("leo");
        registerUserRequest.setNumber("09150429906");
        registerUserRequest.setEmail("fitz@email.com");
        registerUserRequest.setPassword("1234");
        registerUserRequest.setUsername("leo19");
        userService.registerUser(registerUserRequest);
        assertEquals(1,userRepository.count());
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername("leo19");
        loginRequest.setPassword("1234");
        loginRequest.setLogin(true);
        userService.login(loginRequest);
        assertTrue(userRepository.findByUsername(loginRequest.getUsername()).isLogin());

    }

    @Test
    void logout() {
    }

    @Test
    void createContact() {
    }

    @Test
    void updateContact() {
    }

    @Test
    void deleteContact() {
    }
}