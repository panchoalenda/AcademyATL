package clase5.todo_en_uno;

import java.util.Scanner;

public class Helper {

    static Scanner sc = new Scanner(System.in);

    public static void opcion1() {
        System.out.println("Ingrese la edad de su perro");
        int edad = sc.nextInt();
        final int RELACION_EDAD = 7;

        int edadPerro = edad * RELACION_EDAD;
        System.out.println("**********************************************");
        System.out.println("La edad del perro (en años perruno) es " + edadPerro);
        System.out.println("**********************************************");
    }

    public static void opcion2() {
        System.out.print("Ingresa la distancia en millas que necesitas convertir a Km: ");
        double millas = sc.nextDouble();
        final double RELACIONKmMillas = 1.60934;
        double distanciaKm = millas * RELACIONKmMillas;
        System.out.println("**********************************************");
        System.out.println("La distancia en kilómetros es: " + distanciaKm);
        System.out.println("**********************************************");

    }

    public static void opcion3() {
        System.out.println("Ingresa el precio original del producto");
        double precioOriginal = sc.nextDouble();

        System.out.println("Ingresa el descuento que quieres aplicar");
        double descuento = sc.nextDouble();

        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        System.out.println("**********************************************");
        System.out.println("El precio final es: $" + precioFinal);
        System.out.println("**********************************************");

    }

    public static void opcion4() {
        System.out.println("Ingrese el total de la cuenta en el restaurante");
        double totalCuenta = sc.nextDouble();

        System.out.println("Ingrese el porcentaje de propina que desea dejar");
        double porcentajePropina = sc.nextDouble();

        double propina = totalCuenta * (porcentajePropina / 100);

        System.out.println("**********************************************");
        System.out.println("El total de propina a dejar es: $" + propina);
        System.out.println("**********************************************");

    }

    public static void opcion5() {
        Integer numeroAleatorio = (int) (Math.random() * 100);

        System.out.println("Ingrese un número entre 1 y 100 para ver si adivina el número generado aleatoriamente");
        int numeroUsuario = sc.nextInt();

        boolean resultado = numeroAleatorio.equals(numeroUsuario);

        if (resultado) {
            System.out.println("**********************************************");
            System.out.println("FELICIDADES, USTED ACERTÓ EL NÚMERO ALEATORIO");
            System.out.println("El número aleatorio es: " + numeroAleatorio);
            System.out.println("El número que usted eligió es: " + numeroUsuario);
            System.out.println("**********************************************");
        } else {
            System.out.println("**********************************************");
            System.out.println("USTED NO ACERTÓ EL NÚMERO ALEATORIO");
            System.out.println("El número aleatorio es: " + numeroAleatorio);
            System.out.println("El número que usted eligió es: " + numeroUsuario);
            System.out.println("**********************************************");
        }
    }
}


