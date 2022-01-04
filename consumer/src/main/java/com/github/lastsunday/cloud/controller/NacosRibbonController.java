package com.github.lastsunday.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/ribbon")
public class NacosRibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value="/test")
    public String doRibbon(){
        return restTemplate.getForObject("http://ribbon-provider/provider/getRibbonConfig",String.class);
    }
}
