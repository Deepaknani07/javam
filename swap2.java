package yup;

public class Swapping2Numbers {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before swapping values are.."+a+" "+b);
		//logic 1- using third value
		int t=a;
		a=b;
		b=t;
		
		//logic2 - without udingthe third value
		a=a+b;
		b=a-b;
		a=a-b;
		
		//logic 3- without 
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("after swapping values are.."+a+" "+b);
		
	}

}
