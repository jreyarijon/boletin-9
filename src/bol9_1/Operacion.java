/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_1;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class Operacion {

    private int num;

    public Operacion() {

    }

    public Operacion(int n) {
        num = n;
    }

    public void setNum(int n) {
        num = n;
    }

    public int getNum() {
        return num;
    }

    public void verDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee numeros : ");
        num = sc.nextInt();
    }

    public void calculo() {
        verDatos();
        int contadorp = 0;
        int contadorn = 0;
        int contador0 = 0;
        int contadorBucle = 0;
        do {
            if (num == 0) {
                contador0++;
            }
            System.out.println("nº ceros: " + contador0);
            if (num < 0) {
                contadorn++;
            }
            System.out.println("nº negativos: " + contadorn);
            if (num > 0) {
                contadorp++;
            }
            System.out.println("nº positivos: " + contadorp);
            contadorBucle++;
            verDatos();

        } while (contadorBucle < 10);
    }
}
