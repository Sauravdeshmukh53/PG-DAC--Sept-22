class Complex{
	int real;
	int imaginary;
	
	Complex(){
		this.real=0;
		this.imaginary=0;
	}
	Complex(int real){
		this.real=real;
		this.imaginary=0;
	}
	Complex(int real, int imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	
	static void add(Complex c1, Complex c2){
		int realSum = c1.real + c2.real;
		int imgSum = c1.imaginary + c2.imaginary;
		System.out.println("Addition of complex numbes is "+ realSum + " + " +"(" +imgSum+")" + " i");
	}
	
	static void multiplication(Complex c1, Complex c2){
		 
		 int realMulti = (c1.real*c2.real - c1.imaginary*c2.imaginary);
		 int imgMulti = (c1.real*c2.imaginary + c2.real*c1.imaginary);
		 System.out.println("Multiplication of complex numbers is "+ realMulti + " + " +"(" +imgMulti+")" + " i");
	}
	
	public static void main(String args[]){
		Complex c1 = new Complex(3,2);
		Complex c2 = new Complex(4,-2);
		add(c1,c2);
		multiplication(c1,c2);
	}
}