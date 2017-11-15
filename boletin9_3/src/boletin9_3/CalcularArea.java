/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class CalcularArea 
{
 public void Calcular()
 {
     int base,altura,area=0;
     do {
         
         do {
     
     Scanner sc=new Scanner(System.in);
     System.out.println("introduce a base");
     base=sc.nextInt();
     System.out.println("introduce a altura");
     altura=sc.nextInt();
     area=base*altura;
     
         }while (altura<0);
     
     }while (base<0);
     
     System.out.println("a area do rectangulo é "+area);
 }
 
}
