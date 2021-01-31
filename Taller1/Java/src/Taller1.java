import java.util.Scanner;



public class Taller1 {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

		System.out.println("Escriba el limite superior");
	    int limite = sc.nextInt();

	    System.out.println("Escriba el tiempo del sleep");
	    int sleep = sc.nextInt();
	    
	    
	    Scanner s = new Scanner(System.in);

	    System.out.println("Escriba 't' para usar la extensión de clase Thread o 'r' para la interface Runnable");
	    String c = s.nextLine();
	    
	    switch(c) {
	    case "r":
			Thread tr = new Thread(new ImparRunnable(limite, sleep));
			Thread pr = new Thread(new ParRunnable(limite, sleep));
			
			tr.start();
			pr.start();
			break;
	    case "t":
			ParThread tp = new ParThread(limite, sleep);
			ImparThread t = new ImparThread(limite, sleep);

			t.start();
			tp.start();
			break;
	    default:
		    System.out.println("Comando no valido");
		    break;
	    }
	    
	    

	    

		

		
	}
	
}



