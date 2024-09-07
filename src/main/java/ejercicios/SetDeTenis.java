package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {

    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        // TODO: Coloca aquí el código del ejercicio 1: Set de tenis
        String respuesta = "";
        if (numVictoriasA >= 7 && numVictoriasB <= 4 || numVictoriasB >= 7 && numVictoriasA <= 4||numVictoriasA > 7||numVictoriasA > 7) {
            respuesta = "Inválido";
        }
        else if (numVictoriasA >= 6 && numVictoriasA - numVictoriasB >= 2) {
            respuesta = "Ganó A";
        } else if (numVictoriasB >= 6 && numVictoriasB - numVictoriasA >= 2) {
            respuesta = "Ganó B";
        }
        else if (numVictoriasA == 7 && numVictoriasB == 6) {
            respuesta = "Ganó A";
        } else if (numVictoriasB == 7 && numVictoriasA == 6) {
            respuesta = "Ganó B";
        }

        else if (numVictoriasA < 6 && numVictoriasB < 6 || numVictoriasA == 5 && numVictoriasB == 5 || numVictoriasA == 6 && numVictoriasB == 6|| numVictoriasA == 6 && numVictoriasB == 5 || numVictoriasA == 5 && numVictoriasB == 6) {
            return "Aún no termina";
        } else{
            respuesta = "Inválido";
        }
        return respuesta;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();

        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}