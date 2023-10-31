package com.developers.hireasenior.dto;

import com.developers.hireasenior.model.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.codec.language.bm.Lang;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private String firstName;
    private String email;
    private Boolean verified;
    private Title title;
    private Double hourlyPrice;
    private String currency;
    private Set<Technology> technologies;
    private Set<Language> languagesSpoken;
    private Date dateOfBirth;
}
