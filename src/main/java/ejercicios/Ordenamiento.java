package ejercicios;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author danielsanchez
 */
public class Ordenamiento {

    public static String evaluar(int numero1, int numero2, int numero3, int numero4) {
        // TODO: Coloca aquí el código del ejercicio 5: Ordenamiento
        int[] numeros = {numero1, numero2, numero3, numero4};
        Arrays.sort(numeros);

        StringBuilder respuesta = new StringBuilder();
        for (int n : numeros) {
            respuesta.append(n).append(" ");
        }
        
        return respuesta.toString().trim();
    }

     public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Número 1:");
        int numero1 = lector.nextInt();
        System.out.print("Número 2:");
        int numero2 = lector.nextInt();
        System.out.print("Número 3:");
        int numero3 = lector.nextInt();
        System.out.print("Número 4:");
        int numero4 = lector.nextInt();

        String respuesta = evaluar(numero1, numero2, numero3, numero4);
        System.out.println(respuesta);
    }
}
