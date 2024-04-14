package org.africa.semicolon.Dtos.Requests;

import lombok.Data;

@Data
public class LogoutRequest {
    private String username;
    private boolean login;
}
