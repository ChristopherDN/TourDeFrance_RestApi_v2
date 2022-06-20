package com.example.backend.controller;

import com.example.backend.model.Cykelrytter;
import com.example.backend.repository.CykelrytterRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


/**
 * @author Christopher
 */
@SpringBootTest
class CykelrytterControllerTest {

    @Autowired
    CykelrytterRepository cykelrytterRepository;

    @Test
    void getAllCykelryttere() {
        //Arrange
        Cykelrytter testRytter = new Cykelrytter();
        testRytter.setNavn("Test Thomsen");
        //Act
        cykelrytterRepository.save(testRytter);
        //Assert
        assertNotNull(cykelrytterRepository.findAll());
        //tear down
        cykelrytterRepository.delete(testRytter);
    }

    @Test
    void getCykelrytter() {
        //Arrange
        Cykelrytter testRytter = new Cykelrytter();
        testRytter.setCykelrytterId(1);
        testRytter.setNavn("Test Junit");
        //Act
        cykelrytterRepository.save(testRytter);
        //Assert
        assertEquals(cykelrytterRepository.findById(1).get().getNavn(),"Test Junit");
        //tear down
        cykelrytterRepository.delete(testRytter);
    }
}