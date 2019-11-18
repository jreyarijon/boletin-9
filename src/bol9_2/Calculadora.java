/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_2;


/**
 *
 * @author jreyarijon
 */
public class Calculadora {

    private int contador = 10;

    public Calculadora() {

    }

    public Calculadora(int cont) {
        contador = cont;
    }
    
    public void Calcular() {
        int acumuladorSuma = 0;
        double acumuladorProdu = 1;
        do {
            acumuladorSuma = acumuladorSuma + contador;
            acumuladorProdu *= contador;
            System.out.println("Suma sucesiva: " + acumuladorSuma);
            System.out.println("Producto sucesivo: " + acumuladorProdu);
            contador++;
        } while (contador <= 90);
    }

}
