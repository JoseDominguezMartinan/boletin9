/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5a;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class Boletin9_5A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Serie obxSerie=new Serie();
        int n;
        n=sc.nextInt();
        obxSerie.serie1(n);
        
    }
    
}
