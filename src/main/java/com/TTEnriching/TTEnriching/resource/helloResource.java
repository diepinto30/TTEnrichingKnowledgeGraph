package com.TTEnriching.TTEnriching.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class helloResource {

    @GetMapping
    public String hello(){
        return "hello work";
    }
}
