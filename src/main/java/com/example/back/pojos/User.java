package com.example.back.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String username;
    private String email;
    private String avatar;
    private String modDate;
    private String signUpDate;
    

}
