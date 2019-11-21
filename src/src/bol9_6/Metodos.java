/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_6;

import java.util.Scanner;

/**
 *
 * @author Josemolamazo
 */
public class Metodos {

    private int soldo;
    private float traballadores = 0;
    private float traballadores2 = 0;

    public Metodos() {

    }

    public Metodos(int soldo, float traballador, float traballador2) {
        this.soldo = soldo;
        traballadores = traballador;
        traballadores2 = traballador2;
    }

    public void Conta() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Teclee un soldo: ");
            soldo = sc.nextInt();
            if (soldo >= 1000 && soldo <= 1750) {
                traballadores++;
                System.out.println("Nº traballadores cun soldo entre 1000 e 1750: " + traballadores);
            } else if (soldo < 1000) {
                traballadores2++;
                float porcentaxe = traballadores2 / (traballadores + traballadores2) * 100;
                System.out.println("Porcentaxe de traballadores cun soldo menor que 1000= " + porcentaxe + "%");
            }
        } while (soldo != 0);

    }

}
