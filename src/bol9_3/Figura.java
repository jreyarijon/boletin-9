/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_3;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class Figura {
    private int base;
    private int altura;
    
    public Figura(){
        
    }
    public Figura(int b, int a){
        base = b;
        altura = a;
    }
    
    public void setAltura(int b){
        base = b;
    }
    public int getAltura(){
        return altura;
    }
    public void verDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee base: ");
        base = sc.nextInt();
        System.out.println("Teclee altura: ");
        altura = sc.nextInt();
    }
    public void Area(){
        verDatos();
        do{
            System.out.println("Área ="+ base*altura);
            verDatos();
        }while(base > 0 && altura > 0);
    }
}
