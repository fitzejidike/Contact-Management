package org.africa.semicolon.Service;

import org.africa.semicolon.Data.Model.Contacts;
import org.africa.semicolon.Dtos.Requests.*;
import org.africa.semicolon.Dtos.Responses.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest);
    LoginResponse login(LoginRequest loginRequest);
    LogoutResponse logout(LogoutRequest logoutRequest);


    CreateContactResponse createContact(CreateContactRequest createContactRequest);

    UpdateContactResponse updateContact(UpdateContactRequest updateContactRequest);

    DeleteContactReponse deleteContact(DeleteContactRequest deleteContactRequest);

    FindContactResponse findContact(FindContactRequest findContactRequest);

    List<Contacts> findAllContacts();
}
