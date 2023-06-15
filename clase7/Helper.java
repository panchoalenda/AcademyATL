

package clase7;

import java.util.Scanner;

public class Helper {
    int[] numeros;

    public void setNumeros(int dimension) {

        Scanner teclado = new Scanner(System.in);
        numeros = new int[dimension];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el valor para la posición " + (i + 1));
            numeros[i] = teclado.nextInt();
        }
        //teclado.close();
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void menu(){
        System.out.println("***************************************************************");
        System.out.println("¿Desea realizar alguna de las siguientes operaciones?");
        System.out.println("(Ingrese el número de la opción deseada)");
        System.out.println("0 - Mostrar mayor y menor de los números ingresados");
        System.out.println("1 - Mostrar el promedio de todos los números ingresados");
        System.out.println("2 - Salir");
        System.out.println("***************************************************************");
    }

    public void mayorMenor(int[] numeros) {
        int[] mayorYmenor = new int[2];
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            mayor = mayor > numero ? mayor : numero;
            menor = menor < numero ? menor : numero;
        }
        System.out.println("***************************************************************");
        System.out.println("EL número mayor ingresado es: " + mayor + " y el menor es " + menor);
        System.out.println("***************************************************************");
    }

    public void promedio(int[] numeros) {
        double total = 0;
        for (int numero : numeros) {
             total += numero;
        }
        System.out.println("***************************************************************");
        System.out.println("El promedio de los numeros ingresados es: " + (total/numeros.length));
        System.out.println("***************************************************************");
    }
}
