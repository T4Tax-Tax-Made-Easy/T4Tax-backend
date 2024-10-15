package org.shan.t4taxbackendv1.controller;

import org.shan.t4taxbackendv1.entity.Blog;
import org.shan.t4taxbackendv1.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/blog")
    public ResponseEntity<String> blog(@RequestBody Blog blog) {
        System.out.println("Hello");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
