package com.example.thinclient.service;

import org.springframework.stereotype.Service;

@Service
public interface CryptoService {

    String crypto(String text, String key);

    String decrypt(String text, String key);
}
