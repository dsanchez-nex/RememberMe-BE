package com.rememberme.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class NotionController {

    @Value("${notion.api.key}")
    private String notionApiKey;

    @GetMapping("/query-notion")
    public String queryNotionDatabase() {
        return "Hola";
    }
}