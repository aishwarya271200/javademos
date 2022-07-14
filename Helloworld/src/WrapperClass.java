
public class WrapperClass {

	public static void main(String[] args) {

		int y = 1;
		// auto boxing from int to Integer
		Integer x = 2;
		Integer z = new Integer(5);
		// auto unboxing from Integer to int

		int myint = z; // converting automatically auto unboxing
		myint = z.intValue(); // converting explicitly from wrapper to primitive

		short y = 3276;
		Short newshort = y;

	}

}
