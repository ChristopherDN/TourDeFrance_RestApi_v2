package com.example.backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Christopher
 */
@Entity
@Getter
@Setter
public class Cykelrytter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "cykelrytterId", nullable = false)
    private Integer cykelrytterId;


    @ManyToOne
    @JoinColumn(name= "teamId")
    private Cykelhold cykelhold;
    private String navn;
    private String nationalitet;
    private int alder;
    private int samlettid;
    private int bjergpoint;
    private int spurtpoint;


}
