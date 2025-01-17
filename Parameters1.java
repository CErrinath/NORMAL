package Week2;

public class Parameters1 {
	// with return type 
	public static int add(int a, int b) {
		return a+b;
		
	}
	public static void main(String[] args) {
		int sum=add(15,20);
		int sum2=add(34,78);
		
		System.out.println("sum of 15 + 20 :"+sum);
		System.out.println("sum of 34+78 :"+sum2);
		System.out.println("multiplication of sum*sum2:"+sum*sum2);
		System.out.println(sum-sum2);
		System.out.println(sum/sum2);
		System.out.println(sum2/sum);
	}

}
