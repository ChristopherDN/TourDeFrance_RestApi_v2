package com.example.backend.repository;


import com.example.backend.model.Cykelhold;
import com.example.backend.model.Cykelrytter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Christopher
 */
public interface CykelrytterRepository extends JpaRepository<Cykelrytter, Integer> {

    List<Cykelrytter>getCykelrytterByCykelhold(Cykelhold cykelhold);
    List<Cykelrytter>getAllBySamlettidNotNullOrderBySamlettid();
    List<Cykelrytter>getAllByBjergpointNotNullOrderByBjergpointDesc();
    List<Cykelrytter>getAllBySpurtpointNotNullOrderBySpurtpointDesc();

    @Query(
            value =
                    "SELECT * FROM `tour-de-france`.cykelrytter\n" +
                            "         where cykelrytter.alder <=  26\n" +
                            "         ORDER by cykelrytter.samlettid asc;",
            nativeQuery = true)
    List<Cykelrytter>getCykelryttersByAlderAndTime();
}

