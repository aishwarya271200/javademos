package Lesson3;



public class runnableInterface implements Runnable {
	public void run(){
	      System.out.println("Thread is running from Runnable Intrface");
	   }
	   public static void main(String args[]){
	      runnableInterface runnable=new runnableInterface();
	      Thread t1 =new Thread(runnable);
	      t1.start();
	   }

}