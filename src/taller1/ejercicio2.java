/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;

import javax.swing.JOptionPane;


public class ejercicio2 {

    public static void main(String[] args) {

        int ale = (int) (Math.random() * 10);

        JOptionPane.showMessageDialog(null, "SE GENERARON " + ale + " PRODUCTOS");
        String[] prod = new String[ale];
        int[] pre = new int[ale];
        int[] can = new int[ale];
        
        //FOR------------------------------------------------------------------------------------

        for (int i = 0; i < ale; i++) {

            prod[i] = (JOptionPane.showInputDialog(null, "DIGITE PRODUCTO " + (i + 1)));
            pre[i] = (Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE PRECIO DE " + prod[i])));
            can[i] = (Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE CANTIDAD DE " + prod[i])));

            System.out.println("PRODUCTO: " + prod[i] + "    " + "PRECIO: " + pre[i] + "   " + "CANTIDAD: " + can[i]);
        }
        
        //WHILE--------------------------------------------------------------------------------------
        int q = 0;
        while(q < ale){
        
        prod[q] = (JOptionPane.showInputDialog(null, "DIGITE PRODUCTO " + (q + 1)));
            pre[q] = (Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE PRECIO DE " + prod[q])));
            can[q] = (Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE CANTIDAD DE " + prod[q])));

            System.out.println("PRODUCTO: " + prod[q] + "    " + "PRECIO: " + pre[q] + "   " + "CANTIDAD: " + can[q]);
        
        q++;
        }
        
        //DO WHILE-----------------------------------------------------------------------------------------
        
        do{
            prod[q] = (JOptionPane.showInputDialog(null, "DIGITE PRODUCTO " + (q + 1)));
            pre[q] = (Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE PRECIO DE " + prod[q])));
            can[q] = (Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE CANTIDAD DE " + prod[q])));

            System.out.println("PRODUCTO: " + prod[q] + "    " + "PRECIO: " + pre[q] + "   " + "CANTIDAD: " + can[q]);
        
        q++;
        
        }while(q < ale);

    }

}
//
