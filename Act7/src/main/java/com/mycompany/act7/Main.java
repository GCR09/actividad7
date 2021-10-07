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
        int cantidad;
        int sucesiones;
        System.out.println("Escribe la cantidad de numeros primos que "
                + "quieres que se calculen:");
        cantidad=Integer.parseInt(entrada.readLine());
        Metodos.numerosPrimos(cantidad);
        
        System.out.println("Escribe el número de sucesiones que "
                + "quieres visualizar:");
        sucesiones=Integer.parseInt(entrada.readLine());
        Metodos.sucesionFibonacci(sucesiones);
    }
}
