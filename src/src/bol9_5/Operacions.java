/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_5;

/**
 *
 * @author Josemolamazo
 */
public class Operacions {

    private int num;
    private int contador;
    private int acumulador;

    public Operacions() {

    }

    public Operacions(int nu, int contador, int acumulador) {
        num = nu;
        this.contador = contador;
        this.acumulador = acumulador;

    }

    public void CalcularA() {
        num = 2;
        contador = 0;
        acumulador = 0;
        do {
            acumulador = acumulador + num;
            System.out.println("Serie numérica A = " + acumulador);
            contador++;
        } while (contador < 10);
    }

    public void CalcularB() {

        contador = 1;
        do {
            if (contador % 2 == 0) {
                System.out.println("Serie numérica B: " + contador);
            } else {
                System.out.println("Serie numérica B: " + (-contador));
            }
            contador++;
        } while (contador < 10);

    }

    public void CalcularC() {
        num = 1;

        acumulador = 0;

        for (contador = 0; contador <= 10; contador++) {
            System.out.println("Serie numérica C: " + acumulador);

            acumulador += num;
            num = acumulador - num;
        }
    }
}
