import java.util.*;
class MathOperation{
	static int add(int x,int y){
	    return x+y;
	}
	static int subtract(int x,int y){
		return x-y;
	}
	static int multiply(int x,int y){
		return x*y;
	}
	static double power(int x,int y){
		return Math.pow(x,y);
	}
	static void print(int x,int y){
		System.out.println("Addition is "+add(x,y));
		System.out.println("Substraction is "+subtract(x,y));
		System.out.println("Multiplication is "+multiply(x,y));
		System.out.println("Power is "+power(x,y));
	}
}
class Demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A:");
		int a=sc.nextInt();
		System.out.println("Enter B:");
		int b=sc.nextInt();
		MathOperation.print(a,b);
		
	}
}