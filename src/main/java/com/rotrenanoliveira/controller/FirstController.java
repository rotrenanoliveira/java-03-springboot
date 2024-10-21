package com.rotrenanoliveira.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/first-controller")
public class FirstController {

    @GetMapping("/path-params/{id}")
    public String pathParams(@PathVariable(name = "id") String id) {
        return "Path parameter: " + id;
    }

    @GetMapping("/query-params")
    public String queryParams(@RequestParam String id) {
        return "Query parameter: " + id;
    }

    @GetMapping("/multiple-query-params")
    public String queryParams(@RequestParam Map<String, String> allParams) {
        return "Query parameters: " + allParams.entrySet();
    }

    @PostMapping("/body-params")
    public String bodyParams(@RequestBody User user) {
        return "Body params:" + user.username;
    }

    @PostMapping("/headers")
    public String requestHeaders(@RequestHeader("name") String name) {
        return "Headers:" + name;
    }

    @PostMapping("/list-headers")
    public String listHeaders(@RequestHeader Map<String, String> headers) {
        return "Headers:" + headers.entrySet();
    }

    @GetMapping("/response-entity")
    public ResponseEntity<Object> responseEntity() {
        var user = new User("John");

        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    record User(String username) {}

}
