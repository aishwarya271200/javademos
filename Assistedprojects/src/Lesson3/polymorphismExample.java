package Lesson3;
class PolymorphismExample
{
    public int polymorphismExample(int x, int y) 
    { 
        return (x + y); 
    } 
    public int polymorphismExample(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double polymorphismExample(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
    	PolymorphismExample s = new PolymorphismExample(); 
        System.out.println(s.polymorphismExample(10, 20)); 
        System.out.println(s.polymorphismExample(10, 20, 30)); 
        System.out.println(s.polymorphismExample(10.5, 20.5)); 
    } 
}