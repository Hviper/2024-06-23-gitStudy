package com.mybatisdemo.springstudy.feature;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeatureController {
    public FeatureController() {

    }
    @GetMapping("/feature")
    public String feature() {
        return "feature";
    }
}
