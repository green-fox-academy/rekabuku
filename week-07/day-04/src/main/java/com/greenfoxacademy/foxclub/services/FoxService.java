package com.greenfoxacademy.foxclub.services;


import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
    public List<Fox> foxList = new ArrayList<>();

    public void addFox(@RequestParam ("name") String name){
        foxList.add(new Fox(name));
    }
}

