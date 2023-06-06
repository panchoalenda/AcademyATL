import java.util.Scanner;

/*
* 2) Conversor de millas a kilómetros:
Pídele al usuario que ingrese una distancia en millas.
Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
Muestra la distancia en kilómetros al usuario.
*/
public class Clase5_Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la distancia en millas que necesitas convertir a Km: ");
        double millas = sc.nextDouble();
        final double RELACIONKmMillas = 1.60934;
        double distanciaKm = millas * RELACIONKmMillas;

        System.out.println("La distancia en kilómetros es: " + distanciaKm);
    }
}
