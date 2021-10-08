package com.mycompany.act7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Cortez Ramos
 */
public class Main {
    public static BufferedReader entrada =new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        Metodos dato = new Metodos();
        System.out.println("Escribe la cantidad de numeros primos que "
                + "quieres que se calculen:");
        dato.numero=Integer.parseInt(entrada.readLine());
        Metodos.numerosPrimos(dato.numero);
        
        System.out.println("Escribe el número de sucesiones que "
                + "quieres visualizar:");
        dato.numero=Integer.parseInt(entrada.readLine());
        Metodos.sucesionFibonacci(dato.numero);
    }
}
