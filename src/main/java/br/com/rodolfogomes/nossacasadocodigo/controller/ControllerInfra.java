package br.com.rodolfogomes.nossacasadocodigo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControllerInfra {

    @GetMapping(value = "api/start")
    public String start(){
        return "Project started...";
    }
}
