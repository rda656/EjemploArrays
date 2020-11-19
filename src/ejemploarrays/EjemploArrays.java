/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarrays;

/**
 *
 * @author profesor
 */
public class EjemploArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] valores = new int[5];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = ES.leerEntero("Introduzca un valor: ");
        }

        desplazarContenidoArray(valores);
    }

    private static void desplazarContenidoArray(int[] numeros) {
        int vUltimo = numeros[numeros.length - 1];

        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = vUltimo;

    }

    private static void ejemploArray() {
        int[] numeros = new int[10];
        int positivos = 0, negativos = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = ES.leerEntero("Intrdozca un número entero: ");
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                negativos++;
            } else {
                positivos++;
            }
        }

        System.out.format("En el array hay %d números positivos y %d números negativos",
                positivos, negativos);
    }
}
