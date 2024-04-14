package org.africa.semicolon.Dtos.Requests;

import lombok.Data;

@Data
public class UpdateContactRequest {
    private String firstname ;
    private String lastname;
    private String number;
}
