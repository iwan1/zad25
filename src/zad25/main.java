package zad25;

public class main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 Konto a1 = new Konto(1000);
	        Konto a2 = new Konto(1000);
	        Konto a3 = new Konto(1000);
	        Konto a4 = new Konto(1000);
	        Konto a5 = new Konto(1000);
	        Konto a6 = new Konto(1000);
	        Konto a7 = new Konto(1000);
	        Konto a8 = new Konto(1000);
	        Konto a9 = new Konto(1000);
	        Konto a10 = new Konto(1000);
	        
	        
	        a1.start();
	        a1.join();
	        a2.start();
	        a2.join();
	        a3.start();
	        a3.join();
	        a4.start();
	        a4.join();
	        a5.start();
	        a5.join();
	        a6.start();
	        a6.join();
	        a7.start();
	        a7.join();
	        a8.start();
	        a8.join();
	        a9.start();
	        a9.join();
	        a10.start();
	        a10.join();
	}

}
