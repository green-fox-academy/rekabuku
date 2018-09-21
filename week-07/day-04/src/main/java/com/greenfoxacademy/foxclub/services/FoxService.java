package com.greenfoxacademy.foxclub.services;


import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
    public List<Fox> foxList = new ArrayList<>();

    public void addFox(Fox fox){
        foxList.add(fox);
    }
}

