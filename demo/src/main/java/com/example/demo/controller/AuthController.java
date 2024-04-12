package com.example.demo.controller;


import com.example.demo.dto.request.SignInRequest;
import com.example.demo.dto.request.UserRequest;
import com.example.demo.dto.response.SignInResponse;
import com.example.demo.service.AuthService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
//    @Autowired
    private final AuthService authService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/sign-up")
    public void signUp(@RequestBody UserRequest req){
        authService.signUp(req);
    }

//    받아올 것 username, password
//    response userId, userNickname
    @PostMapping("/sign-in")
    public SignInResponse signIn(@RequestBody SignInRequest req){
        return authService.signIn(req);
    }
}
