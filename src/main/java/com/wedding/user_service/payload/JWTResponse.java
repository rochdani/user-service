package com.wedding.user_service.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
@NoArgsConstructor
public class JWTResponse {
    private String token;
    private String type = "Bearer";
    private  Long id;
    private String username;
    private String email;
    private List<String> roles;

    public JWTResponse(String token, Long id, String username, String email, List<String> roles) {
        this.token = token;
        this.type = type;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
}
