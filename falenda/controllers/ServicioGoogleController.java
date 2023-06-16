package es.falenda.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicioGoogleController {

    @GetMapping({"/autocompletar/{palabra}"})
    public List<String> autocomplGoogle(@PathVariable String palabra) {
        List<String> coincidencias = new ArrayList<>();
        List<String> catalogo = new ArrayList<>();
        catalogo.add("Introducción a las metodologías ágiles:");
        catalogo.add("metodologías ágiles Scrum.");
        catalogo.add("metodologías ágiles Kanban.");
        catalogo.add("metodologías ágiles Extreme Programming (XP).");
        catalogo.add("metodologías ágilesLean Software Development.");
        catalogo.add("Agile en diferentes contextos");

        for (String cat : catalogo) {
            if (cat.toLowerCase().contains(palabra.toLowerCase())) {
                coincidencias.add(cat);
            }
        }
        return coincidencias;
    }
}
