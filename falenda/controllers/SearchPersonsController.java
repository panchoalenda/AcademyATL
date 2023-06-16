package es.falenda.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchPersonsController {

    @GetMapping({"/buscar-nombre/{nombre}"})
    public List<String> buscarPersonas(@PathVariable String nombre) {
        String encontrado = null;
        List<String> nombres = new ArrayList<>();
        nombres.add("Marcos Torres");
        nombres.add("Bill Gate");
        nombres.add("Ronald Mcdonald");
        nombres.add("Carlos Moreta");
        return nombres.stream().filter((n) -> n.toLowerCase().contains(nombre.toLowerCase())).toList();
    }
}
