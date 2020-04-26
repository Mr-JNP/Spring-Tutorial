package com.example.domain;

import org.springframework.stereotype.Component;

@Component
public class CoolCatchphrase implements Catchphrase{

    @Override
    public String getCatchphrase() {
        return "Say cool catchphrase.";
    }
}
