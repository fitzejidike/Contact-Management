package org.africa.semicolon.Dtos.Requests;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private  String password;
    private boolean login;
}
