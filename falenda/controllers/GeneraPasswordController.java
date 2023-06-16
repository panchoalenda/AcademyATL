
package es.falenda.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneraPasswordController {

    @GetMapping({"/generador-password/{password}"})
    public String generador(@PathVariable String password) {
        password = password + Math.round(Math.random() * 10000);
        return "La contraseña es: " + password;
    }
}
