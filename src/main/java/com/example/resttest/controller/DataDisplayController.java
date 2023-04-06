package com.example.resttest.controller;

import com.example.resttest.model.DataDisplay;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/fetch")
public class DataDisplayController {
    @PostMapping
    public void callApi(@RequestBody DataDisplay dataDisplay){
        System.out.println(dataDisplay.getMessage());
    }

}
