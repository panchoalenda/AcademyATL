package clase6;

import javax.swing.*;
import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helper {

    static Scanner sc = new Scanner(System.in);

    public static void opcion1() {
        System.out.println("Ingrese el nombre del país que desea buscar en google");
        String pais = (sc.nextLine()).toLowerCase();
        String url = "https://www.google.com/maps/search/";

        System.out.println("**********************************************");
        System.out.println(url + pais);
        System.out.println("**********************************************");
    }

    public static void opcion2() {
        System.out.println("Buscador de Twiter");
        System.out.println("Ingresa el nombre de una celebridad , por ejemplo Messi");
        String nombre = (sc.nextLine()).toLowerCase().trim();
        String url = "https://twitter.com/search?q=";
        System.out.println("**********************************************");
        System.out.println(url + nombre);
        System.out.println("**********************************************");

    }

    public static void opcion3() {
        System.out.println("Ingrese un número de télefono sin espacios, por ejemplo: 5493541539405");
        String numero = (sc.nextLine()).trim();
        String url = "https://api.whatsapp.com/send?phone=";
        System.out.println("**********************************************");
        System.out.println(url + numero);
        System.out.println("**********************************************");

    }

    public static void opcion4() {
        System.out.println("+++++++++++++HISTORIA INTERACTIVA");
        System.out.println("Eres un intrépido detective llamado Jack Thompson, conocido por resolver los casos más" + " difíciles. Un día, recibes una llamada urgente de la policía informándote sobre un robo en el Museo de " + "Arte de la ciudad. Sin perder tiempo, te diriges al lugar del crimen.\n" + "Al llegar al museo, te encuentras con el caos. Las luces parpadean, las alarmas suenan y los guardias " + "de seguridad están aturdidos. Te acercas al encargado del museo, quien te informa que una valiosa pintura " + "ha sido robada y que hay tres sospechosos principales. Te proporciona información sobre cada uno de ellos:");
        System.out.println("1- David Parker: un hábil ladrón de arte con una larga historia de delitos. Se conoce su " + "modus operandi y se ha relacionado con otros robos de pinturas famosas en el pasado.");
        System.out.println("2- Emily Johnson: una talentosa restauradora de arte que había estado trabajando en el museo " + "recientemente. Aunque nunca ha tenido antecedentes penales, su acceso al lugar y su conocimiento del sistema de seguridad la convierten en una posible sospechosa.");
        System.out.println("3- Thomas Baker: el antiguo dueño de la pintura robada, quien recientemente se encontraba en " + "una situación financiera complicada y había amenazado con venderla para resolver sus problemas económicos.");
        System.out.println("Ahora es tu turno de decidir qué camino seguir en la investigación. Puedes elegir " + "interrogar a los sospechosos en el orden que prefieras. ¿A quién te gustaría interrogar primero: David Parker, " + "Emily Johnson o Thomas Baker?");
        System.out.println(" ");
        System.out.println("\"Ingrese de acuerdo a lo decidido 1, 2 o 4\"");
        int op = sc.nextInt();

        switch (op) {
            case 1 -> {
                System.out.println("""
                  Decides interrogar a David Parker, el hábil ladrón de arte. Utilizando tus habilidades deductivas, logras obtener información clave de él. Aunque niega estar involucrado en el robo, proporciona pistas sobre un contacto misterioso con información sobre el paradero de la pintura robada. Tienes la opción de seguir investigando a David para descubrir más detalles o cambiar de enfoque e interrogar a otro sospechoso. ¿Qué decides hacer?\s
                  \n* Si eliges seguir investigando a David Parker, continúa leyendo la Rama 1.
                  \n* Si prefieres cambiar de enfoque y interrogar a otro sospechoso, continúa leyendo la Rama 2.""");
                System.out.println("\"Según lo decidido escribe 1 ó 2\"");
                op = sc.nextInt();
            }
            case 2 -> {
                System.out.println("""
                  Decides interrogar a Emily Johnson, la restauradora de arte. Durante la entrevista, encuentras algunas inconsistencias en su historia y notas signos de nerviosismo. Sin embargo, no tienes suficiente evidencia para incriminarla en el robo. Tienes la opción de profundizar en la investigación sobre Emily o cambiar de enfoque e interrogar a otro sospechoso. ¿Qué decides hacer?\s
                  \n* Si eliges profundizar en la investigación sobre Emily Johnson, continúa leyendo la Rama 3.
                  \n* Si prefieres cambiar de enfoque y interrogar a otro sospechoso, continúa leyendo la Rama 4""");
                System.out.println("\"Según lo decidido escribe 3 ó 4\"");
                op = sc.nextInt();
            }
        }

        switch (op) {
            case 1 -> {
                System.out.println("Sigues investigando a David Parker y descubres que su contacto misterioso " + "se encuentra en un almacén abandonado en las afueras de la ciudad. Te diriges al lugar y, al llegar, " + "te encuentras con una banda de delincuentes. Debes enfrentarte a ellos en un enfrentamiento peligroso " + "para descubrir la verdad sobre la pintura robada. ¿Lograrás recuperarla y resolver el caso?");
                op = 0;
            }
            case 2 -> {
                System.out.println("""
                  Decides interrogar a Emily Johnson, la restauradora de arte. Durante la entrevista, encuentras algunas inconsistencias en su historia y notas signos de nerviosismo. Sin embargo, no tienes suficiente evidencia para incriminarla en el robo. Tienes la opción de profundizar en la investigación sobre Emily o cambiar de enfoque e interrogar a otro sospechoso. ¿Qué decides hacer?
                  \n* Si eliges profundizar en la investigación sobre Emily Johnson, continúa leyendo la Rama 1.
                  \n* Si prefieres cambiar de enfoque y interrogar a otro sospechoso, continúa leyendo la Rama 2.""");
                System.out.println("\"Según lo decidido escribe 1 ó 2\"");
                op = sc.nextInt();
            }
            case 3 -> {
                System.out.println("Sigues investigando a Emily Johnson y descubres que tenía una relación " + "personal con Thomas Baker, el antiguo dueño de la pintura robada. La evidencia sugiere que podrían " + "haber planeado el robo juntos. Ahora debes decidir si confrontar a Emily o continuar con la " + "investigación para obtener pruebas más contundentes.");
                op = 0;
            }
            case 4 -> {
                System.out.println("""
                  Decides interrogar a Thomas Baker, el antiguo dueño de la pintura robada. Durante la entrevista, Thomas se muestra angustiado por su situación financiera y niega rotundamente haber participado en el robo. Sin embargo, menciona que había contratado a un investigador privado para encontrar la pintura antes del robo. Tienes la opción de investigar más a fondo a Thomas o cambiar de enfoque e interrogar a otro sospechoso. ¿Qué decides hacer?
                  \n* Si eliges investigar más a fondo a Thomas Baker, continúa leyendo la Rama 3.
                  \n* Si prefieres ver el final de la historia continua con la Rama 0.""");
                System.out.println("\"Según lo decidido escribe 3 ó 0\"");
                op = sc.nextInt();
            }
        }
        if (op == 3) {
            System.out.println("Sigues investigando a Thomas Baker y descubres que el investigador privado que contrató antes del robo está relacionado con David Parker, el ladrón de arte. Ahora debes decidir si confrontar a Thomas con esta información o continuar investigando para obtener pruebas más sólidas.");
        }
        System.out.println("Después de una intensa investigación y de seguir diferentes pistas, finalmente descubres al verdadero responsable del robo en el Museo de Arte: una conspiración entre Emily Johnson, la restauradora de arte, y Thomas Baker, el antiguo dueño de la pintura robada.\n" + "\n" + "Reúnes suficientes pruebas para incriminar a Emily y Thomas, y los entregas a la policía. Ambos son arrestados y la valiosa pintura es recuperada, devolviendo la tranquilidad al museo y a la comunidad.\n" + "\n" + "Tu habilidad y perseverancia en la resolución del caso te hacen ganar reconocimiento y admiración como detective. Te conviertes en un referente en tu campo y se te presentan nuevas oportunidades para resolver otros casos desafiantes.\n" + "\n" + "La historia del robo en el Museo de Arte se convierte en un hito en tu carrera y tu dedicación a la justicia continúa dejando una huella positiva en la sociedad.\n" + "\n" + "¡Felicidades, detective Thompson, por otro caso resuelto con éxito!");
    }

    public static void opcion5() {
        int total = 0;
        System.out.println("Ingrese la cantidad de números para calcular el promedio (mínimo 2)");
        int cant = sc.nextInt();
        Integer[] numeros = new Integer[cant];

        System.out.println("A continuación se le pedirá que ingrese los " + cant + " números");
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese un numero entero para la posición " + (i + 1));
            numeros[i] = sc.nextInt();
            total += numeros[i];
        }

        System.out.print("A continuación mostramos los números ingresados: ");
        for (Integer n : numeros) {
            System.out.print(n + ", ");
        }
        System.out.println();
        System.out.print("El promedio de todos los números ingresados es: ");
        System.out.print(total / numeros.length);
        System.out.println();
    }

    public static void opcion6() {

        System.out.println("Ingrese la cantidad de números a solicitar, para luego conocer el mayor y el menor");
        System.out.println("El mismo debe ser un número entero.");
        int cant = sc.nextInt();
        Integer[] numeros = new Integer[cant];

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el valor " + (i + 1));
            numeros[i] = sc.nextInt();
        }

        int min = numeros[0];
        int max = numeros[0];
        int aux = 0;
        for (int i = 1; i < cant; i++) {
            max = (max > numeros[i]) ? max : numeros[i];
            min = (min < numeros[i]) ? min : numeros[i];
        }
        System.out.println("De los números ingresados, el mayor es: \"" + max + "\" y el menor es: \"" + min + "\"");

    }

    public static void opcion7() {
        System.out.println("Ingrese un número entero:");
        int numero = sc.nextInt();
        int cont = 1;

        while (cont <= numero) {
            System.out.print(cont + ", ");
            cont++;
        }
    }

    public static void opcion8() {
        String[] opciones = {"piedra", "papel", "tijera"};
        System.out.println("Ingrese una de las siguientes opciones:");
        System.out.println("""
          - Piedra
          - Papel
          - Tijera""");
        String eleUsuario = (sc.nextLine()).toLowerCase();

        int randomCompu = (int) ((Math.random() * 3));
        String eleCompu = opciones[randomCompu];

        System.out.println("Usted eligió: " + eleUsuario);
        System.out.println("La computadora eligió: " + eleCompu);

        if (eleUsuario.equals(eleCompu)) {
            System.out.println("**********************************************************************");
            System.out.println("EMPATARON!!! Tanto la computadora como usted eligieron \"" + eleUsuario + "\"");
            System.out.println("**********************************************************************");
        } else if (eleUsuario.equals("piedra") && eleCompu.equals("tijera") ||
          eleUsuario.equals("papel") && eleCompu.equals("piedra") ||
          eleUsuario.equals("tijera") && eleCompu.equals("papel")) {
            System.out.println("**********************************************************************");
            System.out.println("Felicitaciones GANÓ!! Usted eligió \"" + eleUsuario +
              "\" y la computadora eligió \"" + eleCompu + "\"");
            System.out.println("**********************************************************************");
        } else {
            System.out.println("**********************************************************************");
            System.out.println("PERDIÓ!! Usted eligió \"" + eleUsuario +
              "\" y la computadora eligió \"" + eleCompu + "\"");
            System.out.println("**********************************************************************");
        }
    }
}


