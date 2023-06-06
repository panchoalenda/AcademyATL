import java.util.Scanner;

/*
 * 5) Juego de adivinar el número:
 * Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
 */
public class Clase5_Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numeroAleatorio = (int) (Math.random() * 100);

        System.out.println("Ingrese un número entre 1 y 100 para ver si adivina el número generado aleatoriamente");
        int numeroUsuario = sc.nextInt();

        boolean resultado = numeroAleatorio.equals(numeroUsuario);

        if (resultado) {
            System.out.println("Usted acertó el número aleatorio");
            System.out.println("El número aleatorio es: " + numeroAleatorio);
            System.out.println("El número que usted eligió es: " + numeroUsuario);
        } else {
            System.err.println("Usted NO acertó el número aleatorio");
            System.out.println("El número aleatorio es: " + numeroAleatorio);
            System.out.println("El número que usted eligió es: " + numeroUsuario);
        }
    }
}
