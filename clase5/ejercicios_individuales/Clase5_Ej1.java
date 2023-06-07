package clase5.ejercicios_individuales;

import java.util.Scanner;

/*
* 1) Calculadora de edad de perros:
Pídele al usuario que ingrese la edad de su perro.
Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
*/
public class Clase5_Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la edad de su perro");
        int edad = sc.nextInt();
        final int RELACION_EDAD = 7;

        int edadPerro = edad * RELACION_EDAD;
        System.out.println("La edad del perro (en años perruno) es " + edadPerro);
    }
}
