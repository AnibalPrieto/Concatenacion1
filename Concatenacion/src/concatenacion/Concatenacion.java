/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenacion;

import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class Concatenacion {
    static Scanner scan = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca su nombre ");
        String i;
        String a;
        i=scan.nextLine();
        System.out.println("Introduzca sus apellidos");
        a=scan.nextLine();
        System.out.println(i+" "+a);
        
    }
    
}
