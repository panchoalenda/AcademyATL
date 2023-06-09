package es.falenda.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddDeletePersonsController {
    List<String> names = new ArrayList<>();

    @GetMapping({"/add/{name}"})
    public String addPersons(@PathVariable String name) {
        if (name != null) {
            this.names.add(name);
            return name + " fue agregado exitosamente!";
        } else {
            return "No hay ningún nombre para agregar!";
        }
    }

    @GetMapping({"/delete/{name}"})
    public String deletePersons(@PathVariable String name) {
        String aux = null;
        for (String n : names) {
            if (n.toLowerCase().contains(name.toLowerCase())) {
                aux = n;
            }
        }
        if (aux != null) {
            this.names.remove(aux);
            return aux + " fue eliminado exitosamente!";
        }
        return "No hay ningún nombre para eliminar!";
    }

    @GetMapping({"/list-persons"})
    public List<String> listNames() {
        return this.names.stream().toList();
    }
}
