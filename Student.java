import java.io.*;

class Student{
	public static void main(String h[]){
		System.out.println("The Name of the student is : "+h[0]);
		int roll=Integer.parseInt(h[1]);
		System.out.println("The Roll no. of the student is : "+roll);
		float marks=Float.parseFloat(h[2]);
		System.out.println("The Marks the student is : "+marks);
	}
}