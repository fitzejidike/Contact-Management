package org.africa.semicolon.Controller;

import org.africa.semicolon.Dtos.Requests.*;
import org.africa.semicolon.Dtos.Responses.ApiResponse;
import org.africa.semicolon.Exception.ContactNotFoundException;
import org.africa.semicolon.Exception.LoginException;
import org.africa.semicolon.Exception.SuperContactException;
//import org.africa.semicolon.Service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import static org.springframework.http.HttpStatus.BAD_REQUEST;
//import static org.springframework.http.HttpStatus.CREATED;
//
//@RestController
//@RequestMapping("//api/v1/user")
//public class UserController {
//    @Autowired
//    UserService userService;
//
//    @PostMapping("/register")
//    public ResponseEntity<?> registerUser(@RequestBody RegisterUserRequest registerUserRequest){
//        try {
//            var result = userService.registerUser(registerUserRequest);
//            return new ResponseEntity<>(new ApiResponse(true, result),CREATED);
//        }catch (ContactNotFoundException e){
//            return new ResponseEntity<>(new ApiResponse(false, e.getMessage()), BAD_REQUEST);
//        }
//    }
//    @PostMapping("/Login")
//    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest){
//        try{
//            var result = userService.login(loginRequest);
//            return new ResponseEntity<>(new ApiResponse(true,result),CREATED);
//        }catch (LoginException e){
//            return new ResponseEntity<>(new ApiResponse(false,e.getMessage()),BAD_REQUEST);
//        }
//    }
//    @PostMapping("/Logout")
//    public ResponseEntity<?> logout(@RequestBody LogoutRequest logoutRequest){
//        try {
//            var result = userService.logout(logoutRequest);
//            return new ResponseEntity<>(new ApiResponse(true, result), CREATED);
//        }catch (SuperContactException e){
//            return new ResponseEntity<>(new ApiResponse(false,e.getMessage()),BAD_REQUEST);
//
//
//        }
//    }
//    @DeleteMapping("/createContact")
//    public ResponseEntity<?> createContact(@RequestBody CreateContactRequest createContactRequest){
//        try{
//            var result = userService.createContact(createContactRequest);
//            return new ResponseEntity<>(new ApiResponse(true,result),CREATED);
//        }catch (SuperContactException e){
//            return new ResponseEntity<>(new ApiResponse(false,e.getMessage()),BAD_REQUEST);
//        }
//
//    }
//
//    }@PostMapping("/updateContact")
//    public ResponseEntity<?>updateContact(@RequestBody UpdateContactRequest updateContactRequest){
//        try{
//            var result = userService.updateContact(updateContactRequest);
//            return new ResponseEntity<>(new ApiResponse(true,result),CREATED);
//        }catch (SuperContactException e){
//            return new ResponseEntity<>(new ApiResponse(false,e.getMessage()),BAD_REQUEST);
//        }
//    }
//    @DeleteMapping("/deleteContact")
//    public ResponseEntity<?> deleteContact(@RequestBody DeleteContactRequest deleteContactRequest) {
//        try {
//            var result = userService.deleteContact(deleteContactRequest);
//            return new ResponseEntity<>(new ApiResponse(true, result), CREATED);
//        } catch (SuperContactException e) {
//            return new ResponseEntity<>(new ApiResponse(false, e.getMessage()), BAD_REQUEST);
//        }
//    }
//
//}
