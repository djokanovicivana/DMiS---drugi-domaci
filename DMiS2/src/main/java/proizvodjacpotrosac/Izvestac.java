/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proizvodjacpotrosac;

/**
 *
 * @author Ivana
 */
public class Izvestac extends Thread {

    private static int statId = 0;
    private int id = ++statId;
    Skladiste skladiste;

    public Izvestac(Skladiste skladiste) {
        this.skladiste = skladiste;
       // start();
    }

    public Skladiste getSkladiste() {
        return skladiste;
    }

    @Override
    public void run() {
        try {
                while (!interrupted()) {
                    System.out.println("IZVESTAJ\n");
                    skladiste.izvestavaj();
                    Thread.sleep(10000);
                     }
        } catch (InterruptedException ex) {
            System.out.println("Izvestac " + id + " je zavrsio sa radom");
        }
    }
}


