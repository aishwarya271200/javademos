package Lesson2;

public class callMethod {

int val=50;

int operation(int val) {
	val =val*10/100;
	return(val);
}

public static void main(String args[]) {
	callMethod d = new callMethod();
	System.out.println("Before operation : "+d.val);
	d.operation(100);
	System.out.println("After operation : "+d.val);
	}
}
