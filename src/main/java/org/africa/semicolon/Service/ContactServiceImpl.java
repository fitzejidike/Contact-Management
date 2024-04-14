package org.africa.semicolon.Service;

import org.africa.semicolon.Data.Model.Contacts;
import org.africa.semicolon.Data.Repositories.ContactRepository;
import org.africa.semicolon.Dtos.Requests.CreateContactRequest;
import org.africa.semicolon.Dtos.Requests.DeleteContactRequest;
import org.africa.semicolon.Dtos.Requests.FindContactRequest;
import org.africa.semicolon.Dtos.Requests.UpdateContactRequest;
import org.africa.semicolon.Dtos.Responses.CreateContactResponse;
import org.africa.semicolon.Dtos.Responses.DeleteContactReponse;
import org.africa.semicolon.Dtos.Responses.FindContactResponse;
import org.africa.semicolon.Dtos.Responses.UpdateContactResponse;
import org.africa.semicolon.Exception.ContactNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactRepository contactRepository;
    @Override
    public CreateContactResponse createContact(CreateContactRequest createContactRequest) {
        Contacts contacts = new Contacts();
        contacts.setFirstname(createContactRequest.getFirstname());
        contacts.setLastname(createContactRequest.getLastname());
        contacts.setNumber(createContactRequest.getNumber());
        contacts.setEmail(createContactRequest.getEmail());
        contactRepository.save(contacts);
        CreateContactResponse createContactResponse = new CreateContactResponse();
        createContactResponse.setFirstname(createContactRequest.getFirstname());
        createContactResponse.setMessage("CONTACT CREATED SUCCESSFULLY");
        return createContactResponse;


    }

    @Override
    public UpdateContactResponse updateContact(UpdateContactRequest updateContactRequest) {
        Contacts contacts = new Contacts();
        contacts.setFirstname(updateContactRequest.getFirstname());
        contacts.setLastname(updateContactRequest.getLastname());
        contacts.setNumber(updateContactRequest.getNumber());
        contactRepository.save(contacts);

        UpdateContactResponse updateContactResponse = new UpdateContactResponse();
        updateContactResponse.setFirstname(updateContactRequest.getFirstname());
                updateContactResponse.setMessage("Update Successful");
        return updateContactResponse;
    }

    @Override
    public DeleteContactReponse deleteContact(DeleteContactRequest deleteContactRequest) {
        Contacts contacts = contactRepository.findByFirstName(deleteContactRequest.getFirstname());
        if (contacts == null) throw new ContactNotFoundException("Contact doesn't exist");
        contactRepository.delete(contacts);

        DeleteContactReponse deleteContactReponse = new DeleteContactReponse();
        deleteContactReponse.setFirstname(deleteContactRequest.getFirstname());
        deleteContactReponse.setMessage("Contact successfully deleted");
        return deleteContactReponse;

    }

    @Override
    public FindContactResponse findContact(FindContactRequest findContactRequest) {
        Contacts contacts = contactRepository.findByFirstName(findContactRequest.getFirstname());
        if(contacts == null) throw  new ContactNotFoundException("Contact not found");
        FindContactResponse findContactResponse = new FindContactResponse();
        findContactResponse.setFirstname(findContactRequest.getFirstname());
        findContactResponse.setMessage("Contact found");
        return findContactResponse;
    }

    @Override
    public List<Contacts> findAllContacts() {
        return contactRepository.findAll();
    }

}

