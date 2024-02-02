package com.example.demo.service;

import com.example.demo.model.Items;

import java.util.List;

public interface ItemService {

    void saveItem(Items items);
    List<Items> allItems();
}
