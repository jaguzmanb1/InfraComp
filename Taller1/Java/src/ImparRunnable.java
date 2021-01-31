
public class ImparRunnable implements Runnable{
	
	private int limite;
	private int slep;
	
	public ImparRunnable(int n, int s) {
		this.limite = n;
		this.slep = s;
	}
	
	@Override
	public void run () {
		System.out.println("El valor inicial es " + limite);

		try {
			for (int i = 0 ; i < limite ; i++ ) {
				if (!(i % 2 == 0))
					System.out.println("IMPAR: " + i);
				Thread.sleep(slep);
			}
		}

		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
	

}
