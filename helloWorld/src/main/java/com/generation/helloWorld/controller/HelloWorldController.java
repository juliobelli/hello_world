package com.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade01")
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
    @GetMapping("/bsm-generation")
    public String bsmGeneration(){
        return "\nResponsabilidade Pessoal."
                + "\nMentalidade de Crescimento."
                + "\nOrientação ao Futuro."
                + "\nPersistência."
                + "\nTrabalho em Equipe."
                + "\nProatividade."
                + "\nComunicação."
                + "\nOrientação ao Detalhe.";
    }
    @GetMapping("/objetivos-semana")
    public String objSemana(){
        return "\nAprofundar conhecimentos de Spring."
                + "\nRevisar e aprofundar conhecimentos de java.";
    }
}

