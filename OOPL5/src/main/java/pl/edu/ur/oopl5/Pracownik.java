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
public class Pracownik {
    
    private final String imie;
    private final String nazwisko;
    private final String stanowisko;
    
    
    
  public Pracownik(String imie, String nazwisko, String stanowisko)
  {
      this.imie = imie;
      this.nazwisko = nazwisko;
      this.stanowisko = stanowisko;
  }
  
  
  public void pokazDane()
     {
         System.out.println("Imię: "+this.imie);
         System.out.println("Nazwisko: "+this.nazwisko);
         System.out.println("Stanowisko:  "+this.stanowisko);
     }
    
}
