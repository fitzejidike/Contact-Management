package org.africa.semicolon.Service;

import org.africa.semicolon.Data.Model.Contacts;
import org.africa.semicolon.Data.Model.Users;
import org.africa.semicolon.Data.Repositories.UserRepository;
import org.africa.semicolon.Dtos.Requests.*;
import org.africa.semicolon.Dtos.Responses.*;
import org.africa.semicolon.Exception.LoginException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ContactService contactService;
    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest) {
        Users user = new Users();
        user.setFirstname(registerUserRequest.getFirstname());
        user.setLastname(registerUserRequest.getLastname());
        user.setEmail(registerUserRequest.getEmail());
        user.setNumber(registerUserRequest.getNumber());
        userRepository.save(user);
        RegisterUserResponse registerUserResponse = new RegisterUserResponse();
        registerUserResponse.setFirstname(registerUserRequest.getFirstname());
        registerUserResponse.setMessage("SAVED SUCCESSFULLY ");
        return registerUserResponse;
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        Users user = new Users();
        user.setUsername(loginRequest.getUsername().toLowerCase());
        user.setPassword(loginRequest.getPassword().toLowerCase());
        user.setLogin(true);
        if(!user.getUsername().equals(loginRequest.getUsername())) throw  new LoginException("WRONG USERNAME ENTERED");
        if(!user.getPassword().equals(loginRequest.getPassword())) throw new LoginException("WRONG PASSWORD ENTERED");
        userRepository.save(user);
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setUsername(loginRequest.getUsername());
        loginResponse.setMessage("Login successfully");
        return loginResponse;
    }

    @Override
    public LogoutResponse logout(LogoutRequest logoutRequest) {
        Users user = new Users();
        user.setUsername(logoutRequest.getUsername());
        user.setLogin(false);
        userRepository.save(user);
        LogoutResponse logOutResponse = new LogoutResponse();
        logOutResponse.setUsername(logoutRequest.getUsername());
        logOutResponse.setMessage("LoggedOut Successfully");
        return logOutResponse;
    }

    @Override
    public CreateContactResponse createContact(CreateContactRequest createContactRequest) {
        return contactService.createContact(createContactRequest);
    }

    @Override
    public UpdateContactResponse updateContact(UpdateContactRequest updateContactRequest) {
        return contactService.updateContact(updateContactRequest);
    }

    @Override
    public DeleteContactReponse deleteContact(DeleteContactRequest deleteContactRequest) {
        return contactService.deleteContact(deleteContactRequest);
    }

    @Override
    public FindContactResponse findContact(FindContactRequest findContactRequest) {
        return contactService.findContact(findContactRequest);
    }

    @Override
    public List<Contacts> findAllContacts() {
        return contactService.findAllContacts();
    }

}
