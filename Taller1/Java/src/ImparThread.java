
public class ImparThread extends Thread {

	private int limite;
	private int sleep;

	public ImparThread(int n, int s) {
		this.limite = n;
		this.sleep = s;
	}

	public void run () {
		System.out.println("El valor inicial es " + limite);

		try {
			for (int i = 0 ; i < limite ; i++ ) {
				if (!(i % 2 == 0))
					System.out.println("IMPAR: " + i);
				sleep(sleep);
			}
		}

		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
}
