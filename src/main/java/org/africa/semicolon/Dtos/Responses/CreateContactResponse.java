package org.africa.semicolon.Dtos.Responses;

import lombok.Data;

@Data
public class CreateContactResponse {
    private String firstname ;
    private String lastname;
    private String message;
}
