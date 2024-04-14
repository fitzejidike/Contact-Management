package org.africa.semicolon.Data.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Contacts")
public class Contacts {
    private String id ;
    private String firstname ;
    private String lastname;
    private String email ;
    private String number ;
}
