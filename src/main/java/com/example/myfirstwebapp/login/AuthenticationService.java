package com.example.myfirstwebapp.login;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
       boolean isValidUserName  = username.equalsIgnoreCase("Rokon");;
       boolean isValidPassword = password.equalsIgnoreCase("123");

        return isValidUserName && isValidPassword;
    }
}
