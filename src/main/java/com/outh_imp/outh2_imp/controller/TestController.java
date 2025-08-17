package com.outh_imp.outh2_imp.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/public")
    public String first(){
        return "public api";
    }
    @GetMapping("/private")
    public String second(OAuth2AuthenticationToken token){
        return "private api"+token.getName();
    }
}
