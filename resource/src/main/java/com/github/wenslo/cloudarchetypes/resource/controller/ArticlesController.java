package com.github.wenslo.cloudarchetypes.resource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticlesController {
    @GetMapping("/articles")
    public String[] getArticles() {
        return new String[]{"Articles 1", "Articles 2", "Articles 3"};
    }
}
