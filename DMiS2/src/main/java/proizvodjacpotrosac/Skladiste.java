/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proizvodjacpotrosac;

/**
 *
 * @author Ivana
 */
public class Skladiste {

     private static int statId = 0;
   private int id=++statId;
   private int [] niz;

   private int ulaz;
   private int izlaz;

   private int stanje;
   private final int kapacitet;

    public int getId() {
        return id;
    }

    public int getStanje() {
        return stanje;
    }

    public Skladiste(int kapacitet) {
        this.kapacitet = kapacitet;
        niz = new int[kapacitet];
    }
   
    public synchronized void Stavi(int element)throws InterruptedException
    {
        while(stanje==kapacitet)wait();
        niz[ulaz++] = element;
        stanje++;
        if(ulaz==kapacitet) ulaz = 0;
        //System.out.println("Proizveden je proizvod" + element + " od strane proizvodjaca " + this.id);
               
              // System.out.println(stampaj());
        notifyAll();
    }
    
    public synchronized int Uzmi() throws InterruptedException
    {
        while(stanje==0) wait();
        int element = niz[izlaz];
        niz[izlaz++] = 0;
        stanje--;
        if(izlaz==kapacitet) izlaz = 0;
        //System.out.println("Uzet je proizvod " + element + " od strane potrosaca" + this.id);
             //   System.out.println(stampaj());
        notifyAll();
        return element;
    }

   public synchronized void izvestavaj() throws InterruptedException{
        StringBuilder sb = new StringBuilder();
        sb.append("\nSadrzaj skladista:\n");
        sb.append("Niz:");
        for(int i = 0; i<niz.length;i++)
        {
            sb.append(niz[i]);
            sb.append(",");
        }
        System.out.println(sb);
        
        
    } 

}
