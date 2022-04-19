/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor3enteros;

import javax.swing.JOptionPane;

/**
 *
 * @author npaez
 */
public class Mayor3Enteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        int x, y, z, mayor;

        //Input
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite x: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite y: "));
        z = Integer.parseInt(JOptionPane.showInputDialog("Digite z: "));

        //Processing
        if (x > y) {
            if (x > z) {
                mayor = x;
            } else {
                mayor = z;
            }
        } else {
            if (y > z) {
                mayor = y;
            } else {
                mayor = z;
            }
        }

        //Output
        JOptionPane.showMessageDialog(null, "El mayor es " + mayor, "POO", JOptionPane.WARNING_MESSAGE);

        //End
        System.exit(0);
    }

}
