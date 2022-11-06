import java.util.*;

class qb12{

	void floating(float n){
		if(n==0){
			System.out.println("The number is zero");
		}
		else if(n>0){
			System.out.println("The number is positive");
		}
		else{
			System.out.println("The number is negative");
		}
	}

	void counting(int n){
		int count=0;
		
		while(n!=0){
			count++;
			n=n/10;
		}
		System.out.println("The total number of digits are: "+count);
	}

	void check(int n1,int n2,int n3){
		
		if(n1==n2 && n2==n3 && n3==n1)
			System.out.println("All numbers are equal");
		else if(n1!=n2 && n2!=n3 && n3!=n1)
			System.out.println("All numbers are different");
		else
			System.out.println("All numbers are neither equal nor different");
		
	}
	
	public static void main(String h[]){
		Scanner sc=new Scanner(System.in);

		qb12 o=new qb12();

		int choice,z;

		do{
	
		System.out.println("1.a\n2.b\n3.c");
		System.out.println("Enter your choice");
		choice=sc.nextInt();

		switch(choice){
			case 1:
				System.out.println("Enter the floating number:");
				float f=sc.nextFloat();
				o.floating(f);
				break;

			case 2:
				System.out.println("Enter an integer number:");
				int n=sc.nextInt();
				o.counting(n);
				break;

			case 3:
				System.out.println("Enter first number:");
				int n1=sc.nextInt();

				System.out.println("Enter second number:");
				int n2=sc.nextInt();

				System.out.println("Enter third number:");
				int n3=sc.nextInt();

				o.check(n1,n2,n3);
				break;

			default:
				System.out.println("Enter the valid number");
		}
	
		System.out.println("Enter 1 to continue and 0 to exit");
		z=sc.nextInt();
		}while(z==1);
		
	}
}