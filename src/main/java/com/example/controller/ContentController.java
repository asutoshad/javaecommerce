package com.example.controller;

import com.example.model.Content;
import com.example.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class ContentController {
    @Autowired
    private ContentService cser;

    @PostMapping("/add")
    public String addContent(@RequestBody Content content){
        cser.createContent(content);
        return "successfully added";
    }

}
