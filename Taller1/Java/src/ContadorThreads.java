
public class ContadorThreads extends Thread{

	private static int contador = 0; 
	
	public void run() {
		for ( int i = 0 ; i < 10000; i ++) {
			contador++;
		}
	}
	
	public static void main(String[] args) {
		ContadorThreads[] t = new ContadorThreads[1000];
		
		for (int i = 0 ; i < t.length; i++ ) {
			t[i] = new ContadorThreads();
			t[i].start();
		}
		
		System.out.println(contador);
	}
}
