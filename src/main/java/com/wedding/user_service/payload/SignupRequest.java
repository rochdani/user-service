package com.wedding.user_service.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@ToString
public class SignupRequest {
    private String username;
    private String password;
    private String email;
    private Set<String> role;
}
