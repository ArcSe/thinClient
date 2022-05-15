package com.example.thinclient.controller;

import com.example.thinclient.service.CryptoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CryptoController {

    private CryptoService cryptoService;

    @PostMapping
    public String crypto(){
        cryptoService.crypto();
        return null;
    }

    @PostMapping
    public String decrypt(){
        return null;
    }
}
