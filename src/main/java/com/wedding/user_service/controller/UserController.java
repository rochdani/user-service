//package com.wedding.user_service.controller;
//
//import com.wedding.user_service.model.JwtRequest;
//import com.wedding.user_service.model.JwtResponse;
//import com.wedding.user_service.service.JwtAuthenticationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class UserController {
//    @Autowired
//    private JwtAuthenticationService jwtAuthenticationService;
//
//    @PostMapping("/authenticate")
//    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest jwtRequest) throws Exception {
//        final String token = jwtAuthenticationService.authenticate(jwtRequest.getUsername(), jwtRequest.getPassword());
//        return ResponseEntity.ok(new JwtResponse(token));
//    }
//
//    // Example secured API
//    @GetMapping("/user")
//    public ResponseEntity<?> getUserDetails(@RequestHeader("Authorization") String token) {
//        // Extract username from token and retrieve user details
//        String username = extractUsername(token); // Implement this method to extract username from token
//        UserDetails userDetails = jwtAuthenticationService.loadUserByUsername(username);
//        return ResponseEntity.ok(userDetails);
//    }
//
//    private String extractUsername(String token) {
//        return jwtAuthenticationService.extractUsername(token);
//    }
//}
