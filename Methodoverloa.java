package Week2;

public class Methodoverloa {
	
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public double add(double d , double d2) {
		return d+d2;
		
	}
	public String add(String n1, String n2) {
		return n1+n2;
	
		
	}
	public static void main(String[] args) {
		Methodoverloa m=new Methodoverloa();
		
		System.out.println("sum of numbers :"+m.add(15,20));
		System.out.println("sum of numbers :"+m.add(45,0,-28));
		System.out.println("sum of double :"+m.add(90.09,56.90));
		System.out.println("adding string :"+m.add("Errinath  ", "Good Boy"));
		
	}

}
