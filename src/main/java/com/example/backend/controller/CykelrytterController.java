package com.example.backend.controller;

import com.example.backend.model.Cykelhold;
import com.example.backend.model.Cykelrytter;
import com.example.backend.repository.CykelholdRepository;
import com.example.backend.repository.CykelrytterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



/**
 * @author Christopher
 */
@RestController
@CrossOrigin
public class CykelrytterController {

    @Autowired
    CykelrytterRepository cykelrytterRepository;

    @Autowired
    CykelholdRepository cykelholdRepository;

    @GetMapping("/cykelrytter")
    public List<Cykelrytter> getAllCykelryttere() {
        return cykelrytterRepository.findAll();
    }

    @GetMapping("/cykelrytter/orden")
    public List<Cykelrytter> getAllCykelryttereByTid() {
        return cykelrytterRepository.getAllBySamlettidNotNullOrderBySamlettid();
    }

    @GetMapping("/cykelrytter/bjerg")
    public List<Cykelrytter> getBjergtrøje() {
        return cykelrytterRepository.getAllByBjergpointNotNullOrderByBjergpointDesc();
    }

    @GetMapping("/cykelrytter/spurt")
    public List<Cykelrytter> getSpurttrøje() {
        return cykelrytterRepository.getAllBySpurtpointNotNullOrderBySpurtpointDesc();
    }

    @GetMapping("/cykelrytter/ungdom")
    public List<Cykelrytter> getUngdomstrøje() {
        return cykelrytterRepository.getCykelryttersByAlderAndTime();
    }





    @GetMapping("/cykelrytter/{cykelrytterId}")
    public Cykelrytter getCykelrytter(@PathVariable Integer cykelrytterId){
        return cykelrytterRepository.findById(cykelrytterId).get();
    }


    @GetMapping("/cykelrytter/hold/{cykelhold}")
    public List<Cykelrytter> getCykelrytterByCykelhold(@PathVariable Cykelhold cykelhold){
        return cykelrytterRepository.getCykelrytterByCykelhold(cykelhold);
    }

    @PostMapping("/{teamId}/cykelrytter")
    public Cykelrytter opretCykelrytter(@PathVariable Integer teamId, @RequestBody Cykelrytter cykelrytter){
        cykelrytter.setCykelhold(cykelholdRepository.findById(teamId).get());
        return cykelrytterRepository.save(cykelrytter);
    }

    @PutMapping("/{teamId}/cykelrytter/{cykelrytterId}")
    public Cykelrytter opdaterCykelrytter(@PathVariable Integer teamId, @PathVariable Integer cykelrytterId, @RequestBody Cykelrytter cykelrytter) {
         cykelrytterRepository.findById(cykelrytterId).get();
         cykelrytter.setCykelrytterId(cykelrytterId);
        cykelrytter.setCykelhold(cykelholdRepository.findById(teamId).get());
        //cykelrytter.setCykelhold(cykelholdRepository.getReferenceById(cykelrytterId));
         return cykelrytterRepository.save(cykelrytter);
    }

    @DeleteMapping("/cykelrytter/{cykelrytterId}")
    public void deleteCykelrytter(@PathVariable Integer cykelrytterId) {
        cykelrytterRepository.deleteById(cykelrytterId);
    }


}
