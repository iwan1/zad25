package zad25;


public class Konto extends Thread {
static int saldo;
    
    public Konto(int a)
    {
        saldo = a;
    }
    
    public synchronized void pobranie(int a){
        int pom = saldo - a;
        if(pom > 0){
            saldo = pom;
        }
    }
    
    public synchronized void stanKonta(){
        System.out.println("Stan konta: " + saldo);
    }
    
    @Override
    public void run(){
        System.out.println("Przed pobraniem:");
        stanKonta();
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.out.println("Nie potrafie spac!");
        }
        pobranie(200);
        System.out.println("Po pobraniu:");
        stanKonta();
    }
}
