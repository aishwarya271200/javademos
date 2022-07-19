package Lesson2;

public class methodExample {

public int multipynumbers(int a,int b) {
	int z=a*b;
	return z;
}

public static void main(String[] args) {

	methodExample b=new methodExample();
	int ans= b.multipynumbers(15,8);
	System.out.println("The Multipilcation answer is :"+ans);
}
}
