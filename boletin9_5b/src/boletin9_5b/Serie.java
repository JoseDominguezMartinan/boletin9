/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5b;

/**
 *
 * @author jdominguezmartinan
 */
public class Serie {
    
    public void Serie2(int n)
    {
          int suma;
        for(int contador=1;contador<=n;contador++)
        {
            
           suma=1+contador; 
           
                if(suma%2==0)
                    System.out.print("+"+suma);
                 else
                     System.out.print("-"+suma);
             
            
        }
    }
    
}
