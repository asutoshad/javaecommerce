package com.example.demo.service.impl;

import com.example.demo.model.Items;
import com.example.demo.repository.ItemRepository;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository irep;
    @Override
    public void saveItem(Items items) {

        irep.save(items);
    }

    @Override
    public List<Items> allItems() {

        return irep.findAll();
    }
}
