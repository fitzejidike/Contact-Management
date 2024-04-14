package org.africa.semicolon.Data.Repositories;

import org.africa.semicolon.Data.Model.Contacts;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends MongoRepository<Contacts,String> {
    Contacts findByFirstName(String firstname);
}
