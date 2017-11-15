/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author jdominguezmartinan
 */
public class SumaProducto {
    public void operacions()
    {
         double suma=0,producto=1;
        for (int contador= 10;contador<=90;contador++)
        {
            suma=suma+contador;
            producto=producto*contador;
            
        }
        System.out.println("a suma dos numeros comprendidos entre 10 e 90 é "+suma);
        System.out.println("o producto dos numeros comprendidos entre 10 e 90 é "+producto);
    }
    
    
}
