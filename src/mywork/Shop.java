package mywork;

public class Shop {
	
	int p_no=0;
	synchronized public void put(int n) {
		p_no=n;
		System.out.println("\n produced " + p_no);
	}
	
	synchronized public void get() {
		System.out.println("\n consumed " + p_no);
	}

}
