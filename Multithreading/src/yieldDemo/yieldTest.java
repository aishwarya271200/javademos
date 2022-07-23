package yieldDemo;

public class yieldTest {
	
	public static void main(String[] args) {
		
		simpleLoop sl1 = new simpleLoop();
		Thread t1 = new Thread(sl1);
		t1.setName("t1");
		t1.start();
		
		simpleLoop sl2 = new simpleLoop();
		Thread t2 = new Thread(sl2);
		t2.setName("t2");
		t2.start();
		
		String tname = Thread.currentThread().getName();
		for (int i=1; i<=10; i++) {
			System.out.println(tname + ": " + i);
		}
	}

}