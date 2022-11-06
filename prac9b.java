import java.util.*;

class shape{
	int shape(int side){
		return side*side;
	}
		
	int shape(int l,int b){
		return l*b;
	}	

	double shape(double r){
		return 3.14*r;
	}	
}

class prac9b{
	public static void main(String h[]){
		shape s=new shape();

		System.out.println("The area of the square is "+s.shape(5));
		System.out.println("The area of the square is "+s.shape(4,3));
		System.out.println("The area of the square is "+s.shape(5.2));
	}
}