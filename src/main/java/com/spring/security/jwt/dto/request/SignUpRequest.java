package com.spring.security.jwt.dto.request;

import com.spring.security.jwt.enums.Role;

public class SignUpRequest {
    String name;
    String email;
    String password;
    Role role;
}
