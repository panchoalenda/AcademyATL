/*
* Ejercicio 1)
Vamos a crear una clase llamada Persona. Sus atributos son: id, nombre, edad, fecha de nacimiento y DNI. Construye
los siguientes métodos para la clase:
- Un constructor, donde los datos pueden estar vacíos.
- Los setters y getters para cada uno de los atributos.
- mostrar(): Muestra los datos de la persona.
- esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.
*/
package poo;

import poo.models.Persona;

import java.time.LocalDate;

public class TestPooPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Francisco", 41, LocalDate.of(1982,4,12), "28457758");
        System.out.println(persona1.mostrar());
        System.out.println("Mayor de Edad: " + persona1.esMayorDeEdad());

        System.out.println("/-----------------------------------------------------------/");

        Persona persona2 = new Persona("Alejo", 15, LocalDate.of(2008,3,21), "45678325");
        System.out.println(persona2.mostrar());
        System.out.println("Mayor de Edad: " + persona2.esMayorDeEdad());
    }
}
