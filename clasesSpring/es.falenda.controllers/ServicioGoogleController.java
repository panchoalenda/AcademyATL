
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package es.falenda.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicioGoogleController {

    @GetMapping({"/autocompletar/{palabra}"})
    public List<String> autocomplGoogle(@PathVariable String palabra) {
        List<String> coincidencias = new ArrayList();
        List<String> catalogo = new ArrayList();
        catalogo.add("Introducción a las metodologías ágiles:");
        catalogo.add("metodologías ágiles Scrum.");
        catalogo.add("metodologías ágiles Kanban.");
        catalogo.add("metodologías ágiles Extreme Programming (XP).");
        catalogo.add("metodologías ágilesLean Software Development.");
        catalogo.add("Agile en diferentes contextos");
        Iterator var4 = catalogo.iterator();

        while(var4.hasNext()) {
            String p = (String)var4.next();
            if (p.toLowerCase().contains(palabra.toLowerCase())) {
                coincidencias.add(p);
            }
        }

        return coincidencias;
    }
}
