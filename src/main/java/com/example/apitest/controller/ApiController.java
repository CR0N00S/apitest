package com.example.apitest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apitest.model.ApiModel;
import com.example.apitest.service.ApiService;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiservice;

    // @GetMapping("/findAll")
    // public Object findAll() {
    // return apiservice.findAll();
    // }

    @PostMapping("apitest/gentoken")
    public String insert(@RequestBody ApiModel apiModel) {
        return apiservice.insert(apiModel);
    }
}
