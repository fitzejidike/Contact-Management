package org.africa.semicolon.Dtos.Requests;

import lombok.Data;

@Data
public class RegisterUserRequest {
    private String firstname ;
    private String lastname;
    private String email ;
    private String number;
    private String password;
    private String username;
}
