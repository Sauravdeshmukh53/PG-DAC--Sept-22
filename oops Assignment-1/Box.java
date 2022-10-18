class Box{
	double height;
	double width;
	double breadth;
	Box(double height,double width,double breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	double getVolume(){
		double volume;
		 volume=height*width*breadth;
		 return volume;
	}
	double getArea(){
		double area;
		area=2*((height*width)+(width*breadth)+(breadth*height));
		return area;
	}
	void print(){
		System.out.println("Volume is "+getVolume());
		System.out.println("Surface Area is "+getArea());
	}

	public static void main(String args[]){
		Box S1=new Box(10.00,25.00,36.00);
		S1.print();
		Box S2=new Box(2.00,3.00,4.00);
		S2.print();
	}
}