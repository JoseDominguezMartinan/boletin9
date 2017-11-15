/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class ObterSoldo 
{
    Scanner sc=new Scanner(System.in);
    int numtraballadores,nomileurista,porcentraballadores,numtraballadores2;
    public void Soldo()
    {
        double soldo;
        System.out.println("introduce un soldo");
        soldo=sc.nextDouble();
        while (soldo!=0)
        {
            
            if 
                (1000<=soldo && 1750>=soldo)
            {
                 numtraballadores++; 
                 numtraballadores2++;
            }
            else if (1000>soldo && soldo>0)
                    
            {
                    numtraballadores++;
                    nomileurista++;
                   
            }
             else  if (soldo<0)
                System.out.println("Non se admiten soldos negativos");
            soldo=sc.nextDouble();
        }     
        
        System.out.println("o número de traballadores que cobra entre 1000 e 1750 é "+numtraballadores2);
        System.out.println("o porcentaxe de traballadores que cobran menos de 1000 euros é "+((nomileurista*100)/numtraballadores)+" %");
          
    }
    
}
