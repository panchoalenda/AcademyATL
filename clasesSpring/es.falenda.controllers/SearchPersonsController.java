
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package es.falenda.controllers;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchPersonsController {

    @GetMapping({"/buscar-nombre/{nombre}"})
    public List<String> buscarPersonas(@PathVariable String nombre) {
        new Gson();
        String encontrado = null;
        List<String> nombres = new ArrayList();
        nombres.add("Francisco Alenda");
        nombres.add("Patricia Funes");
        nombres.add("Julian Alenda");
        nombres.add("Pía Alenda");
        return nombres.stream().filter((n) -> {
            return n.contains(nombre);
        }).toList();
    }
}
