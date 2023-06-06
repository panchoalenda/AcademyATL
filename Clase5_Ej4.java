import java.util.Scanner;

/*
* 4) Calculadora de propinas:
Pídele al usuario que ingrese el total de la cuenta en un restaurante.
Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
*/
public class Clase5_Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el total de la cuenta en el restaurante");
        double totalCuenta = sc.nextDouble();

        System.out.println("Ingrese el porcentaje de propina que desea dejar");
        double porcentajePropina = sc.nextDouble();

        double propina = totalCuenta * (porcentajePropina / 100);

        System.out.println("El total de propina a dejar es: $" + propina);
    }
}
