package org.example.springldap.controller;

import lombok.RequiredArgsConstructor;
import org.example.springldap.service.TestService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ldap")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/test")
    public String test() {
        return testService.test();
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/admin")
    public String admin() {
        return "Welcome Admin!";
    }

    @PreAuthorize("hasAnyRole('USER')")
    @GetMapping("/user")
    public String user() {
        return "Welcome User!";
    }
}
