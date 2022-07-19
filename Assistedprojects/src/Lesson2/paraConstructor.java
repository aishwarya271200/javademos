package Lesson2;

class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class paraConstructor {
public static void main(String[] args) {

	Std std1=new Std(4, "Harish");
	Std std2=new Std(12, "Anya");
	std1.display();
	std2.display();
		}
}
