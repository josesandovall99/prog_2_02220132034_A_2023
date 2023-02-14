package taller1;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class ejercicio1 {

    public static void main(String[] args) {


        // DADO UN NUMERO ALEATORIO ENTRE LOS ULTIMOS 3 DIGITOS DEL CODIGO, PEDIR DOUBLES QUE NESESITE Y SACAR MEDIA MODA Y PROMEDIO
        int ale = (int) (Math.random() * 34);

        JOptionPane.showMessageDialog(null, "SE GENERARON " + ale + " NUMEROS");
        double[] matriz = new double[ale];

        for (int i = 0; i < ale; i++) {

            matriz[i] = (Double.parseDouble(JOptionPane.showInputDialog(null, "DIGITE DOUBLE")));

            System.out.println(matriz[i]);

        }

        // PROEMDIO -------------------------------------------------------------------------------
        //FOR
        double suma = 0;
        double res = 0;
        for (int i = 0; i < matriz.length; i++) {

            suma = matriz[i] + suma;

        }

        res = suma / matriz.length;
        JOptionPane.showMessageDialog(null, "EL PROEMDIO ES: " + res);

        //WHILE******************************
        int e = 0;
        while (e > matriz.length) {

            suma = matriz[e] + suma;

            e++;
        }
        res = suma / matriz.length;
        JOptionPane.showMessageDialog(null, "EL PROEMDIO ES: " + res);

        //DO WHILE**************************
        do {

            suma = matriz[e] + suma;

            e++;
        } while (e > matriz.length);
        res = suma / matriz.length;
        JOptionPane.showMessageDialog(null, "EL PROEMDIO ES: " + res);

        System.out.println("PROMEDIO: " + res);

        // MODA---------------------------------------------------------------------------------
        int maximoNumRepeticiones = 0;
        double moda = 0;

        //FOR*****************************************
        for (int i = 0; i < matriz.length; i++) {
            int numRepeticiones = 0;
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i] == matriz[j]) {
                    numRepeticiones++;
                }   //fin if
                if (numRepeticiones > maximoNumRepeticiones) {
                    moda = matriz[i];
                    maximoNumRepeticiones = numRepeticiones;
                }   //fin if
            }
        }

        JOptionPane.showMessageDialog(null, "LA MODA ES: " + moda);

        //WHILE**********************************
        int q = 0;
        int s = 0;
        while (q > matriz.length) {
            int numRepeticiones = 0;
            while (s > matriz.length) {
                if (matriz[q] == matriz[s]) {
                    numRepeticiones++;
                }   //fin if
                if (numRepeticiones > maximoNumRepeticiones) {
                    moda = matriz[q];
                    maximoNumRepeticiones = numRepeticiones;
                }   //fin if

                e++;
            }
            q++;
        }
        JOptionPane.showMessageDialog(null, "LA MODA ES: " + moda);

        //DO WHILE***********************************
        do {
            int numRepeticiones = 0;
            do {
                if (matriz[q] == matriz[s]) {
                    numRepeticiones++;
                }   //fin if
                if (numRepeticiones > maximoNumRepeticiones) {
                    moda = matriz[q];
                    maximoNumRepeticiones = numRepeticiones;
                }
                e++;
            } while (s > matriz.length);
            q++;
        } while (q > matriz.length);
        JOptionPane.showMessageDialog(null, "LA MODA ES: " + moda);

        System.out.println("MODA: " + moda);

        // MEDIA --------------------------------------------------------------------------------------
        int media = 0;

        // FOR*************************************************
        for (int i = 0; i < matriz.length - 1; i++) {// METODO BURBUJA
            for (int j = 0; j < matriz.length - 1; j++) {

                if (matriz[j] > matriz[j + 1]) {

                    double aux = matriz[j];
                    matriz[j] = matriz[j + 1];
                    matriz[j + 1] = aux;

                }

            }
            media = media / 2;

        }
        JOptionPane.showMessageDialog(null, "LA MEDIA ES: " + matriz[matriz.length / 2]);

        // WHILE*************************************************
        int t = 0;
        int l = 0;
        while (t < matriz.length - 1) {
            while (l < matriz.length - 1) {

                if (matriz[l] > matriz[l + 1]) {

                    double aux = matriz[l];
                    matriz[l] = matriz[l + 1];
                    matriz[l + 1] = aux;

                }

                l++;
            }

            media = media / 2;

            t++;
        }
        JOptionPane.showMessageDialog(null, "LA MEDIA ES: " + matriz[matriz.length / 2]);

        //DO WHILE**************************************************
        do {

            do {

                l++;
            } while (l < matriz.length - 1);

            media = media / 2;
            t++;
        } while (t < matriz.length - 1);

        JOptionPane.showMessageDialog(null, "LA MEDIA ES: " + matriz[matriz.length / 2]);

        System.out.println("MEDIA: " + matriz[matriz.length / 2]);
    }

}
