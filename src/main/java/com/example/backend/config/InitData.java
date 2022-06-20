package com.example.backend.config;

import com.example.backend.model.Cykelhold;
import com.example.backend.model.Cykelrytter;
import com.example.backend.repository.CykelholdRepository;
import com.example.backend.repository.CykelrytterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Christopher
 */
@Component
public class InitData implements CommandLineRunner {

    @Autowired
    CykelholdRepository cykelholdRepository;

    @Autowired
    CykelrytterRepository cykelrytterRepository;

    @Override
    public void run(String... args) throws Exception {

        //--------------------------------Nyt hold-------------------------------------------

        Cykelhold hold1 = new Cykelhold();
        hold1.setTeamnavn("Quick-Step Alpha Vinyl Team (WT)");
        cykelholdRepository.save(hold1);

        Cykelrytter cykelrytter1 = new Cykelrytter();
        cykelrytter1.setCykelhold(hold1);
        cykelrytter1.setNavn("Kasper Asgreen");
        cykelrytter1.setAlder(27);
        cykelrytter1.setNationalitet("Danmark");
        cykelrytter1.setSamlettid(114150);
        cykelrytter1.setBjergpoint(10);
        cykelrytter1.setSpurtpoint(4);
        cykelrytterRepository.save(cykelrytter1);

        Cykelrytter cykelrytter2 = new Cykelrytter();
        cykelrytter2.setCykelhold(hold1);
        cykelrytter2.setNavn("Julian Alaphilippe");
        cykelrytter2.setAlder(29);
        cykelrytter2.setNationalitet("Frankrig");
        cykelrytter2.setSamlettid(124540);
        cykelrytter2.setBjergpoint(0);
        cykelrytter2.setSpurtpoint(0);
        cykelrytterRepository.save(cykelrytter2);

        Cykelrytter cykelrytter3 = new Cykelrytter();
        cykelrytter3.setCykelhold(hold1);
        cykelrytter3.setNavn("Andrea Bagioli");
        cykelrytter3.setAlder(23);
        cykelrytter3.setNationalitet("Italien");
        cykelrytter3.setSamlettid(144320);
        cykelrytter3.setBjergpoint(2);
        cykelrytter3.setSpurtpoint(0);
        cykelrytterRepository.save(cykelrytter3);

        Cykelrytter cykelrytter4 = new Cykelrytter();
        cykelrytter4.setCykelhold(hold1);
        cykelrytter4.setNavn("Davide Ballerini");
        cykelrytter4.setAlder(27);
        cykelrytter4.setNationalitet("Italien");
        cykelrytter4.setSamlettid(174320);
        cykelrytter4.setBjergpoint(2);
        cykelrytter4.setSpurtpoint(0);
        cykelrytterRepository.save(cykelrytter4);

        Cykelrytter cykelrytter5 = new Cykelrytter();
        cykelrytter5.setCykelhold(hold1);
        cykelrytter5.setNavn("Mattia Cattaneo");
        cykelrytter5.setAlder(31);
        cykelrytter5.setNationalitet("Italien");
        cykelrytter5.setSamlettid(124320);
        cykelrytter5.setBjergpoint(0);
        cykelrytter5.setSpurtpoint(0);
        cykelrytterRepository.save(cykelrytter5);

        Cykelrytter cykelrytter6 = new Cykelrytter();
        cykelrytter6.setCykelhold(hold1);
        cykelrytter6.setNavn("Rémi Cavagna");
        cykelrytter6.setAlder(26);
        cykelrytter6.setNationalitet("Frankrig");
        cykelrytter6.setSamlettid(141320);
        cykelrytter6.setBjergpoint(0);
        cykelrytter6.setSpurtpoint(0);
        cykelrytterRepository.save(cykelrytter6);

        //--------------------------------Nyt hold-------------------------------------------
        Cykelhold hold2 = new Cykelhold();
        hold2.setTeamnavn("Team BikeExchange - Jayco (WT))");
        cykelholdRepository.save(hold2);

        Cykelrytter cykelrytter7 = new Cykelrytter();
        cykelrytter7.setCykelhold(hold2);
        cykelrytter7.setNavn("Alexandre Balmer");
        cykelrytter7.setAlder(22);
        cykelrytter7.setNationalitet("Schweiz");
        cykelrytter7.setSamlettid(144320);
        cykelrytter7.setBjergpoint(0);
        cykelrytter7.setSpurtpoint(2);
        cykelrytterRepository.save(cykelrytter7);

        Cykelrytter cykelrytter8 = new Cykelrytter();
        cykelrytter8.setCykelhold(hold2);
        cykelrytter8.setNavn("Jack Bauer");
        cykelrytter8.setAlder(37);
        cykelrytter8.setNationalitet("New Zealand");
        cykelrytter8.setSamlettid(164320);
        cykelrytter8.setBjergpoint(4);
        cykelrytter8.setSpurtpoint(6);
        cykelrytterRepository.save(cykelrytter8);

        Cykelrytter cykelrytter9 = new Cykelrytter();
        cykelrytter9.setCykelhold(hold2);
        cykelrytter9.setNavn("Sam Bewley");
        cykelrytter9.setAlder(34);
        cykelrytter9.setNationalitet("New Zealand");
        cykelrytter9.setSamlettid(144320);
        cykelrytter9.setBjergpoint(0);
        cykelrytter9.setSpurtpoint(0);
        cykelrytterRepository.save(cykelrytter9);

        Cykelrytter cykelrytter10 = new Cykelrytter();
        cykelrytter10.setCykelhold(hold2);
        cykelrytter10.setNavn("Kevin Colleoni");
        cykelrytter10.setAlder(22);
        cykelrytter10.setNationalitet("Italien");
        cykelrytter10.setSamlettid(134320);
        cykelrytter10.setBjergpoint(4);
        cykelrytter10.setSpurtpoint(0);
        cykelrytterRepository.save(cykelrytter10);

        Cykelrytter cykelrytter11 = new Cykelrytter();
        cykelrytter11.setCykelhold(hold2);
        cykelrytter11.setNavn("Lawson Craddock");
        cykelrytter11.setAlder(30);
        cykelrytter11.setNationalitet("United States");
        cykelrytter11.setSamlettid(154320);
        cykelrytter11.setBjergpoint(0);
        cykelrytter11.setSpurtpoint(2);
        cykelrytterRepository.save(cykelrytter11);

        Cykelrytter cykelrytter12 = new Cykelrytter();
        cykelrytter12.setCykelhold(hold2);
        cykelrytter12.setNavn("Christopher Juul-Jensen");
        cykelrytter12.setAlder(32);
        cykelrytter12.setNationalitet("Danmark");
        cykelrytter12.setSamlettid(101310);
        cykelrytter12.setBjergpoint(8);
        cykelrytter12.setSpurtpoint(6);
        cykelrytterRepository.save(cykelrytter12);

        //--------------------------------Nyt hold-------------------------------------------
        Cykelhold hold3 = new Cykelhold();
        hold3.setTeamnavn("Israel - Premier Tech (WT)");
        cykelholdRepository.save(hold3);

        Cykelrytter cykelrytter13 = new Cykelrytter();
        cykelrytter13.setCykelhold(hold3);
        cykelrytter13.setNavn("Rudy Barbier");
        cykelrytter13.setAlder(29);
        cykelrytter13.setNationalitet("Frankrig");
        cykelrytter13.setSamlettid(172340);
        cykelrytter13.setBjergpoint(2);
        cykelrytter13.setSpurtpoint(2);
        cykelrytterRepository.save(cykelrytter13);

        Cykelrytter cykelrytter14 = new Cykelrytter();
        cykelrytter14.setCykelhold(hold3);
        cykelrytter14.setNavn("Sebastian Berwick");
        cykelrytter14.setAlder(22);
        cykelrytter14.setNationalitet("Australien");
        cykelrytter14.setSamlettid(152340);
        cykelrytter14.setBjergpoint(0);
        cykelrytter14.setSpurtpoint(0);
        cykelrytterRepository.save(cykelrytter14);

        Cykelrytter cykelrytter15 = new Cykelrytter();
        cykelrytter15.setCykelhold(hold3);
        cykelrytter15.setNavn("Patrick Bevin");
        cykelrytter15.setAlder(31);
        cykelrytter15.setNationalitet("Australien");
        cykelrytter15.setSamlettid(142340);
        cykelrytter15.setBjergpoint(0);
        cykelrytter15.setSpurtpoint(0);
        cykelrytterRepository.save(cykelrytter15);

        Cykelrytter cykelrytter16 = new Cykelrytter();
        cykelrytter16.setCykelhold(hold3);
        cykelrytter16.setNavn("Jenthe Biermans");
        cykelrytter16.setAlder(26);
        cykelrytter16.setNationalitet("Belgien");
        cykelrytter16.setSamlettid(152320);
        cykelrytter16.setBjergpoint(2);
        cykelrytter16.setSpurtpoint(0);
        cykelrytterRepository.save(cykelrytter16);

        Cykelrytter cykelrytter17 = new Cykelrytter();
        cykelrytter17.setCykelhold(hold3);
        cykelrytter17.setNavn("Jakob Fuglsang");
        cykelrytter17.setAlder(37);
        cykelrytter17.setNationalitet("Danmark");
        cykelrytter17.setSamlettid(112340);
        cykelrytter17.setBjergpoint(6);
        cykelrytter17.setSpurtpoint(2);
        cykelrytterRepository.save(cykelrytter17);

        Cykelrytter cykelrytter18 = new Cykelrytter();
        cykelrytter18.setCykelhold(hold3);
        cykelrytter18.setNavn("Simon Clarke");
        cykelrytter18.setAlder(35);
        cykelrytter18.setNationalitet("Australien");
        cykelrytter18.setSamlettid(192340);
        cykelrytter18.setBjergpoint(0);
        cykelrytter18.setSpurtpoint(0);
        cykelrytterRepository.save(cykelrytter18);

        //--------------------------------Nyt hold-------------------------------------------
        Cykelhold hold4 = new Cykelhold();
        hold4.setTeamnavn("EF Education-EasyPost (WT)");
        cykelholdRepository.save(hold4);

        Cykelrytter cykelrytter19 = new Cykelrytter();
        cykelrytter19.setCykelhold(hold4);
        cykelrytter19.setNavn("Mark Padun");
        cykelrytter19.setAlder(25);
        cykelrytter19.setNationalitet("Ukraine");
        cykelrytter19.setSamlettid(172340);
        cykelrytter19.setBjergpoint(6);
        cykelrytter19.setSpurtpoint(4);
        cykelrytterRepository.save(cykelrytter19);

        Cykelrytter cykelrytter20 = new Cykelrytter();
        cykelrytter20.setCykelhold(hold4);
        cykelrytter20.setNavn("Tom Scully");
        cykelrytter20.setAlder(32);
        cykelrytter20.setNationalitet("Australien");
        cykelrytter20.setSamlettid(192340);
        cykelrytter20.setBjergpoint(0);
        cykelrytter20.setSpurtpoint(2);
        cykelrytterRepository.save(cykelrytter20);

        Cykelrytter cykelrytter21 = new Cykelrytter();
        cykelrytter21.setCykelhold(hold4);
        cykelrytter21.setNavn("Lachlan Morton");
        cykelrytter21.setAlder(30);
        cykelrytter21.setNationalitet("Australien");
        cykelrytter21.setSamlettid(162340);
        cykelrytter21.setBjergpoint(0);
        cykelrytter21.setSpurtpoint(0);
        cykelrytterRepository.save(cykelrytter21);

        Cykelrytter cykelrytter22 = new Cykelrytter();
        cykelrytter22.setCykelhold(hold4);
        cykelrytter22.setNavn("Jens Keukeleire");
        cykelrytter22.setAlder(33);
        cykelrytter22.setNationalitet("Belgien");
        cykelrytter22.setSamlettid(282320);
        cykelrytter22.setBjergpoint(0);
        cykelrytter22.setSpurtpoint(0);
        cykelrytterRepository.save(cykelrytter22);

        Cykelrytter cykelrytter23 = new Cykelrytter();
        cykelrytter23.setCykelhold(hold4);
        cykelrytter23.setNavn("Michael Valgren");
        cykelrytter23.setAlder(30);
        cykelrytter23.setNationalitet("Danmark");
        cykelrytter23.setSamlettid(111340);
        cykelrytter23.setBjergpoint(2);
        cykelrytter23.setSpurtpoint(10);
        cykelrytterRepository.save(cykelrytter23);

        Cykelrytter cykelrytter24 = new Cykelrytter();
        cykelrytter24.setCykelhold(hold4);
        cykelrytter24.setNavn("Magnus Cort");
        cykelrytter24.setAlder(29);
        cykelrytter24.setNationalitet("Danmark");
        cykelrytter24.setSamlettid(120342);
        cykelrytter24.setBjergpoint(6);
        cykelrytter24.setSpurtpoint(4);
        cykelrytterRepository.save(cykelrytter24);

        //--------------------------------Nyt hold-------------------------------------------
        Cykelhold hold5 = new Cykelhold();
        hold5.setTeamnavn("Trek - Segafredo (WT)");
        cykelholdRepository.save(hold5);

        Cykelrytter cykelrytter25 = new Cykelrytter();
        cykelrytter25.setCykelhold(hold5);
        cykelrytter25.setNavn("Jakob Egholm");
        cykelrytter25.setAlder(24);
        cykelrytter25.setNationalitet("Danmark");
        cykelrytter25.setSamlettid(104342);
        cykelrytter25.setBjergpoint(4);
        cykelrytter25.setSpurtpoint(8);
        cykelrytterRepository.save(cykelrytter25);

        Cykelrytter cykelrytter26 = new Cykelrytter();
        cykelrytter26.setCykelhold(hold5);
        cykelrytter26.setNavn("Jon Aberasturi");
        cykelrytter26.setAlder(33);
        cykelrytter26.setNationalitet("Spanien");
        cykelrytter26.setSamlettid(151343);
        cykelrytter26.setBjergpoint(6);
        cykelrytter26.setSpurtpoint(0);
        cykelrytterRepository.save(cykelrytter26);

        Cykelrytter cykelrytter27 = new Cykelrytter();
        cykelrytter27.setCykelhold(hold5);
        cykelrytter27.setNavn("Filippo Baroncini");
        cykelrytter27.setAlder(21);
        cykelrytter27.setNationalitet("Italien");
        cykelrytter27.setSamlettid(181241);
        cykelrytter27.setBjergpoint(4);
        cykelrytter27.setSpurtpoint(2);
        cykelrytterRepository.save(cykelrytter27);

        Cykelrytter cykelrytter28 = new Cykelrytter();
        cykelrytter28.setCykelhold(hold5);
        cykelrytter28.setNavn("Asbjørn Hellemose");
        cykelrytter28.setAlder(23);
        cykelrytter28.setNationalitet("Danmark");
        cykelrytter28.setSamlettid(216342);
        cykelrytter28.setBjergpoint(2);
        cykelrytter28.setSpurtpoint(8);
        cykelrytterRepository.save(cykelrytter28);

        Cykelrytter cykelrytter29 = new Cykelrytter();
        cykelrytter29.setCykelhold(hold5);
        cykelrytter29.setNavn("Alexander Kamp");
        cykelrytter29.setAlder(28);
        cykelrytter29.setNationalitet("Danmark");
        cykelrytter29.setSamlettid(122345);
        cykelrytter29.setBjergpoint(9);
        cykelrytter29.setSpurtpoint(6);
        cykelrytterRepository.save(cykelrytter29);

        Cykelrytter cykelrytter30 = new Cykelrytter();
        cykelrytter30.setCykelhold(hold5);
        cykelrytter30.setNavn("Kenny Elissonde");
        cykelrytter30.setAlder(30);
        cykelrytter30.setNationalitet("Frankrig");
        cykelrytter30.setSamlettid(152444);
        cykelrytter30.setBjergpoint(0);
        cykelrytter30.setSpurtpoint(0);
        cykelrytterRepository.save(cykelrytter30);

//--------------------------------Nyt hold-------------------------------------------
        Cykelhold hold6 = new Cykelhold();
        hold6.setTeamnavn("Team DSM (WT)");
        cykelholdRepository.save(hold6);

        Cykelrytter cykelrytter31 = new Cykelrytter();
        cykelrytter31.setCykelhold(hold6);
        cykelrytter31.setNavn("Asbjørn Kragh Andersen");
        cykelrytter31.setAlder(30);
        cykelrytter31.setNationalitet("Danmark");
        cykelrytter31.setSamlettid(143343);
        cykelrytter31.setBjergpoint(6);
        cykelrytter31.setSpurtpoint(6);
        cykelrytterRepository.save(cykelrytter31);

        Cykelrytter cykelrytter32 = new Cykelrytter();
        cykelrytter32.setCykelhold(hold6);
        cykelrytter32.setNavn("Søren Kragh Andersen");
        cykelrytter32.setAlder(27);
        cykelrytter32.setNationalitet("Danmark");
        cykelrytter32.setSamlettid(113845);
        cykelrytter32.setBjergpoint(4);
        cykelrytter32.setSpurtpoint(2);
        cykelrytterRepository.save(cykelrytter32);

        Cykelrytter cykelrytter33 = new Cykelrytter();
        cykelrytter33.setCykelhold(hold6);
        cykelrytter33.setNavn("Marco Brenner");
        cykelrytter33.setAlder(19);
        cykelrytter33.setNationalitet("Danmark");
        cykelrytter33.setSamlettid(115342);
        cykelrytter33.setBjergpoint(2);
        cykelrytter33.setSpurtpoint(4);
        cykelrytterRepository.save(cykelrytter33);

        Cykelrytter cykelrytter34 = new Cykelrytter();
        cykelrytter34.setCykelhold(hold6);
        cykelrytter34.setNavn("Thymen Arensman");
        cykelrytter34.setAlder(22);
        cykelrytter34.setNationalitet("Frankrig");
        cykelrytter34.setSamlettid(171343);
        cykelrytter34.setBjergpoint(0);
        cykelrytter34.setSpurtpoint(0);
        cykelrytterRepository.save(cykelrytter34);

        Cykelrytter cykelrytter35 = new Cykelrytter();
        cykelrytter35.setCykelhold(hold6);
        cykelrytter35.setNavn("Tim Naberman");
        cykelrytter35.setAlder(23);
        cykelrytter35.setNationalitet("Holland");
        cykelrytter35.setSamlettid(153343);
        cykelrytter35.setBjergpoint(0);
        cykelrytter35.setSpurtpoint(2);
        cykelrytterRepository.save(cykelrytter35);

        Cykelrytter cykelrytter36 = new Cykelrytter();
        cykelrytter36.setCykelhold(hold6);
        cykelrytter36.setNavn("Alberto Dainese");
        cykelrytter36.setAlder(24);
        cykelrytter36.setNationalitet("Italien");
        cykelrytter36.setSamlettid(135343);
        cykelrytter36.setBjergpoint(0);
        cykelrytter36.setSpurtpoint(0);
        cykelrytterRepository.save(cykelrytter36);
    }


}














