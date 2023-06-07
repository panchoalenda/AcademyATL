package clase5.todo_en_uno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner pausar = new Scanner(System.in);

        System.out.println("INGRESE UNA OPCION");
        System.out.println("1-Calculadora de edad de perros");
        System.out.println("2-Conversor de millas a kilómetros");
        System.out.println("3-Calculadora de descuento");
        System.out.println("4-Calculadora de propinas");
        System.out.println("5-Juego de adivinar el número");
        System.out.println("6-Salir");

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
                    continue;
                }
            }
            System.out.println("Presione una \"Enter\" para continuar");
            pausar.nextLine();

            System.out.println();
            System.out.println("ELIJA UNA OPCION DEL \"1 AL 5\" PARA CONTINUAR O \"6\" PARA SALIR");
            System.out.println("1-Calculadora de edad de perros");
            System.out.println("2-Conversor de millas a kilómetros");
            System.out.println("3-Calculadora de descuento");
            System.out.println("4-Calculadora de propinas");
            System.out.println("5-Juego de adivinar el número");
            System.out.println("6-Salir");

            opcion = sc.nextInt();

        } while(opcion != 6);

        System.out.println("Finalizando el programa...");
        System.out.println("Hasta Pronto");
    }
}
