package com.birzavit.Birzavitec2.controller;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/")
public class IdatController {

    @GetMapping(path="/")
    public String home(){
        return "A20200702 - Birzavit Alvarez";
    }

    @GetMapping(path="/idat/codigo")
    public String cod(){
        return "A20200702";
    }

    @GetMapping(path="/idat/nombre-completo")
    public String nombrecompleto(){
        return "Birzavit Alvarez Pinto";
    }
    
}