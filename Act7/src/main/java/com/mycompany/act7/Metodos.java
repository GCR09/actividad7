package com.mycompany.act7;
/**
 *
 * @author Cortez Ramos
 */
public class Metodos {
    public int numero;
    public static void numerosPrimos(int limite) {
        int[ ] num_primos = new int[limite];
        int numeros=0;
        for(int i = 1; i < limite*limite; i++){
            int contador=0;
           for(int j = 1; j <= i; j++){
                if (i%j==0){
                    contador++;
                }    
            }
            if(numeros!=limite){
                if (contador==2){
                    num_primos [numeros] = i;
                    numeros++;
                }
            }
        }
        System.out.println("------------------------------------");
        System.out.println("Lista de numeros primos");
        for(int i = 0; i < limite; i++){
            System.out.println((i+1)+ "-." + num_primos [i]);
        }
        System.out.println("------------------------------------");
    }
    
    public static void sucesionFibonacci(int n) {
        int a = 0, b = 1, c;
       
        int[ ] fibonacci = new int[n];
        
        for(int i = 0; i < n; i++){
            fibonacci [i] = a;
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("------------------------------------");
        System.out.println("Sucesion de fibonacci");
        for(int i = 0; i < n; i++){
            System.out.println((i+1)+ "-." + fibonacci [i]);
        }
        System.out.println("------------------------------------");
    }
}
