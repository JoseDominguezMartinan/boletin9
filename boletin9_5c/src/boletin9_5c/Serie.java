/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5c;

/**
 *
 * @author jdominguezmartinan
 */
public class Serie {
    int i,numero=1,suma=0,primero=0,segundo=0;
    
    public void Serie3(int n)
    {
        System.out.print("0+1");
        for (i=0;i<=n-3;i++)
        {
          segundo=numero;
          suma=primero+segundo;
          primero=segundo;
          segundo=suma;
          numero=suma;
          System.out.print("+"+suma);
        }
       
    }
    
    
}    

