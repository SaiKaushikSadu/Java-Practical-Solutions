import java.util.*;

interface exam{
	boolean pass(int marks);
}

interface classify{
	String division(int average);
}

class result implements exam,classify{

	@Override
	public boolean pass(int marks){
		if(marks<40){
			return false;
		}
		else{
			return true;
		}
	}

	@Override
	public String division(int average){
		String s;
		if(average>80){
			s="First";
			return s;
		}
		else if(average>60){
			s="Second";
			return s;
		}
		else if(average>40){
			s="Third";
			return s;
		}
		else{
			s="FAIL";
			return s;
		}
	}
}

class qb1{
	public static void main(String h[]){
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the marks of phy");
		int p=sc.nextInt();
		System.out.println("Enter the marks of chem");
		int c=sc.nextInt();
		System.out.println("Enter the marks of maths");
		int m=sc.nextInt();

		int total=p+c+m;
		int avg=total/3;

		result r=new result();
		System.out.println(r.pass(total));
		System.out.println("The division :" +r.division(avg));
		
	}
}