package clase6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner pausar = new Scanner(System.in);

        System.out.println("INGRESE UNA OPCION");
        System.out.println("1-Buscador de países con Google Maps.");
        System.out.println("2-Buscador de tweets para Twitter.com. Es bastante similar al anterior.");
        System.out.println("3-Programa que permita llamar a una persona por Whatsapp.");
        System.out.println("4-Cuento con una historia dinámica.");
        System.out.println("5-Calcular promedio de números ingresados");
        System.out.println("6-Elegir el número mayor entre 3 números ingresados");
        System.out.println("7-Mostrar números desde el 1 hasta valor ingresado");
        System.out.println("8-Jugar el juego clásico de \"piedra, papel, tijeras\" contra la computadora");
        System.out.println("9-Salir");

        int opcion = sc.nextInt();

        do{
            switch (opcion) {
                case 1 -> {
                    Helper.opcion1();
                }
                case 2 -> {
                    Helper.opcion2();
                }
                case 3 -> {
                    Helper.opcion3();
                }
                case 4 -> {
                    Helper.opcion4();
                }
                case 5 -> {
                    Helper.opcion5();
                }
                case 6 -> {
                    Helper.opcion6();
                }
                case 7 -> {
                    Helper.opcion7();
                }
                case 8 -> {
                    Helper.opcion8();
                }
                case 9 -> {
                    continue;
                }
            }
            System.out.println("Presione un \"Enter\" para continuar");
            pausar.nextLine();

            System.out.println();
            System.out.println("ELIJA UNA OPCION DEL \"1 AL 8\" PARA CONTINUAR O \"9\" PARA SALIR");
            System.out.println("1-Buscador de países con Google Maps.");
            System.out.println("2-Buscador de tweets para Twitter.com. Es bastante similar al anterior.");
            System.out.println("3-Programa que permita llamar a una persona por Whatsapp.");
            System.out.println("4-Cuento con una historia dinámica.");
            System.out.println("5-Calcular promedio de números ingresados");
            System.out.println("6-Elegir el número mayor entre 3 números ingresados");
            System.out.println("7-Mostrar números desde el 1 hasta valor ingresado");
            System.out.println("8-Jugar el juego clásico de \"piedra, papel, tijeras\" contra la computadora");
            System.out.println("9-Salir");

            opcion = sc.nextInt();

        } while(opcion != 9);

        System.out.println("Finalizando el programa...");
        System.out.println("Hasta Pronto");
    }
}
