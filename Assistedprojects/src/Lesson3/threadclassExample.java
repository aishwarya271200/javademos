package Lesson3;



public class threadclassExample extends Thread {
	public void run()
 	{
  		System.out.println("Thread started running");
}
 	public static void main( String args[] )
 	{
  		threadclassExample mt = new  threadclassExample();
  		mt.start();
 	}
}