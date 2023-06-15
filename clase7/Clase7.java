/*
1) Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
2) Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el
número menor.
3) Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se
divide por 5, ya que el usuario agregó 5 números.
* */
package clase7;

import javax.swing.*;
import java.util.Scanner;

public class Clase7 {
    public static void main(String[] args) {
        Helper cargar = new Helper();
        Scanner teclado = new Scanner(System.in);

        //int dimension = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de números a solicitar"));
        System.out.println("Ingrese la cantidad de números a solicitar:");
        int dimension = teclado.nextInt();
        cargar.setNumeros(dimension);

        System.out.println("Estos son los números ingresados");
        int[] numeros = cargar.getNumeros();
        for (int numero : numeros) {
            System.out.println(numero + " ");
        }

       cargar.menu();

        //int op = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la opcion deseada"));
        System.out.println("Ingrese la opción deseada");
        int op = teclado.nextInt();
        do {
            switch (op) {
                case 0 -> cargar.mayorMenor(numeros);
                case 1 -> cargar.promedio(numeros);
            }
            cargar.menu();
            System.out.println("Ingrese la opción deseada");
            op = teclado.nextInt();
        } while (op != 2);
        System.out.println("***************************************************************");
        System.out.println("Programa finalizado");
        System.out.println("Hasta pronto");
        System.out.println("***************************************************************");
    }
}


