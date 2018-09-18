package com.bluff.controller;

import com.bluff.dao.FactRepository;
import com.bluff.entity.Fact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/fact")
public class FactController {

    @Autowired
    private FactRepository factRepository;


    @GetMapping("/all")
    public List<Fact> getAll(){
        return factRepository.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Fact fact){
        factRepository.insert(fact);
    }


}
