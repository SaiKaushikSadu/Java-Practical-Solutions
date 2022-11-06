import java.util.*;

class telephone{
	int pin,phone;
	String name;
	
	telephone(String name,int pin,int phone){
		this.name=name;
		this.pin=pin;
		this.phone=phone;
	}		

}

class display{
	static void show(telephone t[]){
		for(int i=0;i<t.length;i++){
			System.out.println("Name is: "+t[i].name);
			System.out.println("Pin code is is : "+t[i].pin);
			System.out.println("Phone number is : "+t[i].phone);
		}
	}
}

class qb19{
	public static void main(String h[]){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();

		telephone t[]=new telephone[n];
		
		for(int i=0;i<n;i++){
			System.out.println("Enter the name:");
			sc.nextLine();
			String s=sc.nextLine();
			System.out.println("Enter the pin:");
			int p=sc.nextInt();
			System.out.println("Enter the phone no:");
			int ph=sc.nextInt();
		
			t[i]=new telephone(s,p,ph);
			System.out.println();
		}
		display.show(t);		                                               
	}
}