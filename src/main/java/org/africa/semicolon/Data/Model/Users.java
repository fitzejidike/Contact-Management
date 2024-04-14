package org.africa.semicolon.Data.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document("Users")
public class Users {
    private String firstname;
    private String lastname;
    private String username;
    private String number;
    private String email;
    private String password;
    private boolean login;
    private List<Contacts>contacts = new ArrayList<>();
}
