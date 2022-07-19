package Lesson2;

public class inner {
	
	public static void main (String args[]) {
		outer.inner in=new outer().new inner();
		in.show();
	}

}
class outer{
	class inner{
		public void show()
		{
			System.out.println("This is a inner class");
		}
	}
}