/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proizvodjacpotrosac;

/**
 *
 * @author Ivana
 */
public class DMiS2 {

    public static void main(String[] args) {
         Skladiste skladiste = new Skladiste(5);

               for(int i = 0; i<10;i++)
        {
            Proizvodjac proizvodjac = new Proizvodjac(skladiste,1000,3000);
           // proizvodjac.start();
        }
        for(int i = 0; i<10;i++)
        {
            Potrosac potrosac = new Potrosac(skladiste,3000,10000);
            //potrosac.start();
        }
        Izvestac izvestac = new Izvestac(skladiste);
       
        izvestac.start();
       
        
    }
    }
