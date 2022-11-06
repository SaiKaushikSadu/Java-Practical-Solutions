import java.util.*;

class shape{
	
	shape(int side){
		System.out.println("The area of square is "+side*side);
	}
	shape(int l, int b){
		System.out.println("The area of rectangle is "+l*b);
	}
	shape(double r){
		System.out.println("The area of circle is "+3.14*r);
	}	
}

class prac9a{
	public static void main(String h[]){
		shape s1=new shape(5);
		shape s2=new shape(4,3);
		shape s3=new shape(5.2);
	}
}
