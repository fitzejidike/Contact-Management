package org.africa.semicolon.Service;

import org.africa.semicolon.Data.Model.Contacts;
import org.africa.semicolon.Dtos.Requests.CreateContactRequest;
import org.africa.semicolon.Dtos.Requests.DeleteContactRequest;
import org.africa.semicolon.Dtos.Requests.FindContactRequest;
import org.africa.semicolon.Dtos.Requests.UpdateContactRequest;
import org.africa.semicolon.Dtos.Responses.CreateContactResponse;
import org.africa.semicolon.Dtos.Responses.DeleteContactReponse;
import org.africa.semicolon.Dtos.Responses.FindContactResponse;
import org.africa.semicolon.Dtos.Responses.UpdateContactResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactService {
    CreateContactResponse createContact(CreateContactRequest createContactRequest);

    UpdateContactResponse updateContact(UpdateContactRequest updateContactRequest);

    DeleteContactReponse deleteContact(DeleteContactRequest deleteContactRequest);

    FindContactResponse findContact(FindContactRequest findContactRequest);

    List<Contacts> findAllContacts();




}
