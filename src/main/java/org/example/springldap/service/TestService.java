package org.example.springldap.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    public String test() {
        return "Welcome to LDAP!";
    }
}
