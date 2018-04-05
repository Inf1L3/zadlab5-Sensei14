package pl.edu.ur.oopl5;


import java.util.Scanner;
import pl.edu.ur.oopl5.Pracownik;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sensei
 */
public class Firma {
    
    public Pracownik[] spis = new Pracownik[100];
    private int nr = 0;
    
    Scanner odczyt = new Scanner(System.in);
    
    public void add()
    {
        String imie, nazwisko, stanowisko;
        System.out.println("Imie: ");
        imie = odczyt.nextLine();
        System.out.println("Nazwisko: ");
        nazwisko = odczyt.nextLine();
        System.out.println("Stanowisko: ");
        stanowisko = odczyt.nextLine();

        spis[nr] = new Pracownik(imie, nazwisko, stanowisko);
        nr++;
    }
    
    public void showAll()
    {
        for(int i=0; i<nr; i++)
        {
            System.out.println("Pracownik["+(i+1)+"] ");
            spis[i].pokazDane();
        }
    }
    
}
