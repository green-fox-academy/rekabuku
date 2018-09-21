package com.greenfoxacademy.foxclub.services;
import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
    public List<Fox> foxList = new ArrayList<>();
    public Fox fox;


    public void addFox(String name){
        foxList.add(new Fox(name));
    }

    public boolean isNewFox (String name){
        for (Fox foxName : foxList) {
            if (foxName.equals(name))
                return false;
        }
        return true;
    }
}

