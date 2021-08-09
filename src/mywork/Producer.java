package mywork;

public class Producer implements Runnable {
	
	Thread t;
	Shop sh;

	public Producer(Shop sh) {
		super();
		this.sh = sh;
		t = new Thread(this, "producer");
		t.start();
	}

	@Override
	public void run() {
		try {
			for(int i=0;i<=5;i++) {
				Thread.sleep(2000);
				sh.put(i);
			}
		}catch(Exception e) {
			System.out.println("\n error " + e);
		}

	}

}
