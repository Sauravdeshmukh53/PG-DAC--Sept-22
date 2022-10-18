/*Write a program to implement a class “student” with the following members. Name of the student.
 Marks of the student obtained in three subjects. Function to assign initial values. Function to compute total average.
 Function to display the student’s name and the total marks.
 Write an appropriate main() function to demonstrate the functioning of the above*/
 import java.util.*;
 class Student{
	 String name;
	 int totalmarks;
	 void setdata(String name,int totalmarks){
		 this.name=name;
		 this.totalmarks=totalmarks;
	 }
	 double average(int totalmarks){
		 double average;
		 average=(double)totalmarks/3;
		 return average;
	 }
	 void print(){
		 System.out.println("Student name is "+name);
		 System.out.println("Student totalmarks is "+totalmarks);
	 }
	 public static void main(String args[]){
		 Student S1=new Student();
		 Scanner sc=new Scanner(System.in);
		 int Arr[]=new int[3];
		 int sum=0;
		 for(int i=0;i<3;i++){
			 Arr[i]=sc.nextInt();
		 }
		 for(int i=0;i<3;i++){
			 sum=sum+Arr[i];
		 }
		
		 S1.setdata("Saurav",sum);
		 S1.print();
			
		 
	 }
 }