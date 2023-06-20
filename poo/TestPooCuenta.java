/*
* Ejercicio 2)
Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular (que es una persona) y
cantidad (puede tener decimales). Construye los siguientes métodos para la clase:
- Un constructor, donde los datos pueden estar vacíos.
- Los setters y getters para cada uno de los atributos. El atributo no se puede modificar directamente,
sólo ingresando o retirando dinero.
- mostrar(): Muestra los datos de la cuenta.
- ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
- retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en números rojos.
*/

package poo;

import poo.models.Cuenta;

import java.sql.SQLOutput;

public class TestPooCuenta {
    public static void main(String[] args) {
        System.out.println("/----------------------------------------------------/");
        Cuenta cuenta1 = new Cuenta("Francisco", 150000);
        System.out.println("/----------------------------------------------------/");
        cuenta1.ingresar(50000);
        System.out.println("/----------------------------------------------------/");
        cuenta1.retirar(500000);
    }
}
