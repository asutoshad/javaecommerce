package com.example.demo.controller;

import com.example.demo.model.Items;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ItemController {
    @Autowired
    private ItemService iser;

    @PostMapping("/add/item")
    private String addItem(@RequestBody Items items){
        iser.saveItem(items);
        return  "successfully added";
    }
    @GetMapping("/add/items")
    private String addItems(){
        return "backend/addItem";
    }

    @GetMapping("/itemlist")
    public List<Items> getAllItems() {
        List<Items> itemsList= iser.allItems();


        return itemsList;

    }
}
