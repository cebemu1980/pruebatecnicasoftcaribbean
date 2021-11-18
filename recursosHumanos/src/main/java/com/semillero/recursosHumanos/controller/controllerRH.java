package com.semillero.recursosHumanos.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/demo")
public class controllerRH {
    @PostMapping(path = "/add")
    public @ResponseBody String addNewUser(
            @RequestParam String name,
            @RequestParam String email
    ){
        return "Saved";
    }
}
