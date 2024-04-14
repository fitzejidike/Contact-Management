package org.africa.semicolon.Dtos.Requests;

import lombok.Data;

@Data
public class CreateContactRequest {
    private String firstname ;
    private String lastname;
    private String email ;
    private String number ;
}
