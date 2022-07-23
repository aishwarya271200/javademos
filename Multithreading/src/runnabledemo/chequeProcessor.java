package runnabledemo;

public class chequeProcessor implements Runnable {

	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + ": Processed the checks.");
	}

}
