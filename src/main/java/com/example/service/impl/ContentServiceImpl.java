package com.example.service.impl;

import com.example.model.Content;
import com.example.repository.ContentRepository;
import com.example.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentServiceImpl implements ContentService {
    @Autowired
    private ContentRepository crep;
    @Override
    public Content createContent(Content content) {
        return crep.save(content);
    }
}
