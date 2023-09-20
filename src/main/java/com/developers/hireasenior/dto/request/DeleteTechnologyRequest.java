package com.developers.hireasenior.dto.request;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeleteTechnologyRequest {

    @NotBlank(message = "Code is required.")
    private String code;

}
