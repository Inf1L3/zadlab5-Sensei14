/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author Sensei
 */
public class Liczba {

 
    private String liczba;
    private final int[] cyfry;

    public Liczba(String liczba) {
        
        this.liczba = liczba;
        this.cyfry = new int[liczba.length()];
    }


    public int[] conv() {
        
    char[] tab = this.liczba.toCharArray();
        for (int i = 0; i < tab.length; i++) {
            this.cyfry[i] = (int) tab[i] - 48;
        }
        return cyfry;
    }

    public void wypisz() {
        for (int i = 0; i < this.cyfry.length; i++) {
            System.out.println(cyfry[i]);
        }

    }

    public int mnoz(int m)
    {
        int wynik=0;
        int x=1;
        for(int i=cyfry.length-1; i>=0; i--)
        {
            wynik=wynik+(cyfry[i]*x*m);
            x*=10;
        }
        
        return wynik;
    }
    
    public int silnia()
    {
        int silnia=1;
        int koniec=0;
        int x=1;
       for(int i=0; i<cyfry.length; i++)
       {
           koniec+=cyfry[i]*x;
           x*=10;
       }
       
       for (int i=1; i<=koniec; i++)
       {
           silnia*=i;
       }
       
       return silnia;
    }
    
}
