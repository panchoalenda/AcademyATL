/*
* 1) Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área
del cuadrado.
2) Hacer una función que calcule el área de un triángulo. Al llamarla debe devolver el área
del triángulo.
3) Crear una función que sea un generador de contraseñas. Al llamarla debe devolver una
contraseña (por ejemplo, puedes utilizar Math.random() para devolver un número
aleatorio que podría ser una contraseña.
4) Crea una aplicación en Springboot que permita generar contraseñas (utilizando el
código del ejercicio anterior) al llamar a la siguiente ruta:
localhost:8080/generar-password
5) Hacer nuevamente el juego de Piedra, Papel o Tijeras pero utilizando funciones, arreglos
y bucles.
* */
package clase8;

import java.util.Scanner;

public class Clase8 {
    public static void main(String[] args) {
        Helper helper = new Helper();
        Scanner teclado = new Scanner(System.in);
        Scanner teclado1 = new Scanner(System.in);

        System.out.println("Ingrese uno de los lados del cuadrado, para calcular su superficie");
        int lado = teclado.nextInt();
        System.out.println("***********************************************************************");
        System.out.println("El area del cuadrado de lado " + lado + " es : " + helper.areaCuadrado(lado));
        System.out.println("***********************************************************************");

        System.out.println("A continuación se le pedirá que ingrese la base y la altura del triángulo, para calcular su superficie");
        System.out.print("Ingrese la base del triángulo y presione enter: ");
        int base = teclado.nextInt();
        System.out.print("Ahora ingrese la altura del triángulo y presione enter: ");
        int altura = teclado.nextInt();
        System.out.println("***********************************************************************");
        System.out.println("El area del triángulo de base " + base + " y altura " + altura + " es : " + helper.areaTriangulo(base, altura));
        System.out.println("***********************************************************************");

        System.out.println("Ingrese una palabra para el generador de contraseñas");
        String palabra = teclado1.nextLine();
        System.out.println("***********************************************************************");
        System.out.println("La contraseña generada es: " + helper.generaPassword(palabra));
        System.out.println("***********************************************************************");
    }
}
