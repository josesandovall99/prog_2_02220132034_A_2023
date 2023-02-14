package taller1;

import javax.swing.JOptionPane;

public class ejercicio3 {

    public static void main(String[] args) {// INGRESAR NOMBRE Y MOSTRARLO AL REVEZ 

        String nombre = JOptionPane.showInputDialog(null, "INSERTE PALABRA");
        String revez = "";
        
        //FOR--------------------------------------------------------------------------------------------------------

        for (int i = nombre.length() - 1; i >= 0; i--) {

            
            char letra = nombre.charAt(i);

            revez = revez + letra;
            System.out.println(nombre.charAt(i));

        }

        JOptionPane.showMessageDialog(null, "PALABRA INVERTIDA: " + revez);

        // WHILE ----------------------------------------------------------------------------------------------------
        int i = nombre.length()-1;
        while (i >= 0) {
            char letra = nombre.charAt(i);

            revez = revez + letra;
            
            i--;

        }
        
        JOptionPane.showMessageDialog(null, "PALABRA INVERTIDA: " + revez);
        
        
        // DO WHILE -------------------------------------------------------------------------------------------------
        
        do{
        char letra = nombre.charAt(i);

            revez = revez + letra;
            
            i--;
        
        
        }while(i>=0);
        JOptionPane.showMessageDialog(null, "PALABRA INVERTIDA: " + revez);

        
    }

}
