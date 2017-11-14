/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9__1;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class Numeros {
    
    public void contarnumeros()
    {
        int contador,num,ceros=0,positivos=0,negativos=0;
        for(contador=0;contador<10;contador++)
        {
          Scanner sc=new Scanner(System.in);
          System.out.println("teclea un numero");
          num=sc.nextInt();
            if(num==0)
                ceros=ceros+1;
            else if(num<0)
                negativos=negativos+1;
            else
                positivos=positivos+1;
        }
          System.out.println("hai "+ceros+" ceros");
            System.out.println("hai  "+negativos+" negativos");
        System.out.println("hai  "+positivos+" positivos");
    
    }}
