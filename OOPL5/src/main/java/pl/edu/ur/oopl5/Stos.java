/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author Sensei
 */
public class Stos {

    private final int[] stos;
    private int wsk;

    Scanner odczyt = new Scanner(System.in);

    public Stos(int n) {
        this.stos = new int[n];
        this.wsk = 0;
    }

    public void push() {
        if (this.wsk == this.stos.length) {
            System.out.println("Stos jest przepełniony, nie można dodać kolejnego elementu");

        } else {
            int a;
            System.out.println("Podaj element do umieszczenia na stosie: ");
            a = odczyt.nextInt();

            this.stos[wsk] = a;
            this.wsk++;

        }
    }

    public void pop() {

        if (this.wsk < 0) {
            System.out.println("Stos jest pusty, nie można ściągnąć elementu");

        } else {
            int p;
            p = this.stos[wsk-1];
            wsk--;
            System.out.println(p);
        }
    }

}
