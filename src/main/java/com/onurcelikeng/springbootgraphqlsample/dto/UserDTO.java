package com.onurcelikeng.springbootgraphqlsample.dto;

import lombok.*;

@Getter
@Setter
public final class UserDTO {

    private String name;
    private String surname;
    private Long identityNumber;
    private String gender;
    private String birthPlace;
}
