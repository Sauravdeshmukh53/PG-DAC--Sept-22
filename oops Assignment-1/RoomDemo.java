import java.util.*;
class Room{
	double height;
	double width;
	double breadth;
	void setdata(double height,double width,double breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
		
	}
	
	double volume(){
		double V;
		V=height*width*breadth;
		return V;
	}
	void print(){
		System.out.println("Volume is "+volume());
	}
}
class RoomDemo extends Room{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Room S1=new Room();
		S1.setdata(a,b,c);
		S1.volume();
		S1.print();
	}
}