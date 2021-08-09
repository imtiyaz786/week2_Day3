package mywork;

public class Consumer implements Runnable {
	
	Thread t;
	Shop s;

	public Consumer(Shop s) {
		super();
		this.s = s;
		t = new Thread(this, "consumer");
		t.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				s.get();
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			System.out.println("\n Error " + e);
		}

	}

}
