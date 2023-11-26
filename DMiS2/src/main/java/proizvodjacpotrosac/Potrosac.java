package proizvodjacpotrosac;

public class Potrosac extends Thread{
    private static int statId = 0;
    private int id=++statId;

    private Skladiste skladiste;
    private int brojac = 0;
    private int minTime ;
    private int maxTime ;
    
    private int trajanje = minTime + (int)Math.random()*(maxTime-minTime);

    public Potrosac(Skladiste skladiste, int minTime, int maxTime) {
        this.skladiste = skladiste;
        this.minTime = minTime;
        this.maxTime = maxTime;
        System.out.println(trajanje);
        start();
    }

    @Override
    public void run() {
      
        try
        {
            while(!interrupted())
            {
                int proizvod = skladiste.Uzmi();
                System.out.println("Uzet je proizvod " + proizvod );
                int trajanje = minTime + (int)Math.random()*(maxTime-minTime);
                sleep(trajanje);
                
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Potrosac "+id+ " je zavrsio sa radom");
        }
    }
    
    
}
