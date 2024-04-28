package com.ps.jwt.dao;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;
    private String email;
    private String password;
    private String role;
}
