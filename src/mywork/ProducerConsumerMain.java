package mywork;

public class ProducerConsumerMain {
	
	public static void main(String[] args) {
		
		Shop s = new Shop();
		Producer p = new Producer(s);
		Consumer c= new Consumer(s);

	}

}
