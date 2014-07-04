/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej15;

import java.util.Scanner;


/**
 *
 * @author V1C70R MU3N735
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int posc =0;int sum=0; int suma=0; int mayor =0;
         System.out.println("Ingrese la dimensión del vector");
        int valor=entrada.nextInt();
        int[] arreglo1=new int[valor];
        
        for (int i = 0; i < valor; i++) {
            System.out.println("Ingrese "+(i+1)+" Valor:");
            int num=entrada.nextInt();
            arreglo1 [i] = num;
        }
        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < i; j++) {
                if (i == j) {
                    sum= i;
                    mayor = sum;
                }
               suma= i+j;
                if (suma > mayor) {
                    mayor = suma;
                }
            }
        }
         System.out.println(mayor);   
        }
    }
    

