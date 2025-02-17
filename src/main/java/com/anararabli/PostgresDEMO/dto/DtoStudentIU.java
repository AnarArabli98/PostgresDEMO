package com.anararabli.PostgresDEMO.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {

    @NotEmpty(message = "Bos buraxila bilmez")
    @Min(value = 3,message = "Firstname min 3 simvol olmalidir")
    @Max(value = 10, message = "max 10 olmalidir")
    private String firstName;

    @Size(min = 3,max = 30)
    private String lastName;
    private Date birthDate;
    @Email(message = "email formatinda olmalidir")
    private String email;
}
