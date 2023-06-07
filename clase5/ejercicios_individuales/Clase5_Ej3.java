package clase5.ejercicios_individuales;

import java.util.Scanner;

/*
* 3) Calculadora de descuento:
Pídele al usuario que ingrese el precio original de un producto.
Pídele al usuario que ingrese el porcentaje de descuento.
Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
Muestra el precio final al usuario.
*/
public class Clase5_Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el precio original del producto");
        double precioOriginal = sc.nextDouble();

        System.out.println("Ingresa el descuento que quieres aplicar");
        double descuento = sc.nextDouble();

        double precioFinal = precioOriginal - (precioOriginal * descuento/100);

        System.out.println("El precio final es: $" + precioFinal);
    }
}
