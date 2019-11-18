/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_4;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class Tabla {
    private int num;
    
    public Tabla(){
        
    }
    public Tabla(int n){
        num = n;
    }
    public void darDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee numero: ");
        num = sc.nextInt();
    }
    public void Calcular(){
        int contador = 0;
        int acumulador = 1;
        while(num != 0)
            acumulador = contador * num;
            contador++;
            
            
    }
}
