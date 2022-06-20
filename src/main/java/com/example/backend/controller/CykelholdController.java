package com.example.backend.controller;

import com.example.backend.model.Cykelhold;
import com.example.backend.repository.CykelholdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Christopher
 */
@CrossOrigin
@RestController
public class CykelholdController {

    @Autowired
    CykelholdRepository cykelholdRepository;

    @GetMapping("/cykelhold")
    public List<Cykelhold> getAllCykelhold() {
        return cykelholdRepository.findAll();
    }

    @GetMapping("/cykelhold/{teamId}")
    public Cykelhold getCykelholdbyId(@PathVariable Integer teamId) {
        return cykelholdRepository.findById(teamId).get();
    }


}
