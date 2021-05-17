package com.sendmequiz.quizemailverifier.dto;

import lombok.Data;

@Data
public class VerificationRequestDTO {

    private String email;
    private String username;
    private String validationLink;
}
