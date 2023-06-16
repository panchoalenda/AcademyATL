
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package es.falenda.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneraPasswordController {

    @GetMapping({"/generador-password/{password}"})
    public String generador(@PathVariable String password) {
        password = password + String.valueOf(Math.round(Math.random() * 1000.0));
        return "La contraseña es: " + password;
    }
}
