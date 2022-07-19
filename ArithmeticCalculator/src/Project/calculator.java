package Project;

import java.util.Scanner;

public class calculator {

	public static void main(String args[]) {
		int a, b, e;
		

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the first number");
		a = obj.nextInt();
		System.out.println("Enter the second number");
		b = obj.nextInt();
		calculation cal = new calculation(a, b);
		System.out.println("Enter the operation to be done 1.addition 2.subtraction 3.multiplication 4.division ");
		e = obj.nextInt();
		cal.perform(e);

	}
}

	final class calculation {

		int a, b;
		
		calculation(int a, int b) {
			this.a = a;
			this.b = b;
		}
	

		

		void perform(int d){
		 
		switch(d) {
     case 1:System.out.println("The addition of two number is " +(a+b));
             break;
     case 2:System.out.println("The subtraction of two number is  " +(a-b));
             break;
     case 3:System.out.println("The multiplication of two number is "  +(a*b));
             break;
     case 4:System.out.println("The division of two number is " +(a/b));
             break;
     default : System.out.println("Invalid operator2");
             break;
 }
		}
	}
     
