package org.africa.semicolon.Data.Repositories;


import org.africa.semicolon.Data.Model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Users,String> {
    Users findByUsername(String Username);
}
