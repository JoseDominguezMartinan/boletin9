/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5a;

/**
 *
 * @author jdominguezmartinan
 */
public class Serie {
    
    public void serie1(int n)
    {
        int doble=2;
        System.out.print(doble);
        for(int contador=1;contador<=n;contador++)
        {
            
           doble=2*contador; 
           
            System.out.print("+"+doble);
        }
        
    }
    
}
