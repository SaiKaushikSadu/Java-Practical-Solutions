import java.util.*;

class odd_Ex extends Exception{
	
	odd_Ex(String s){
		super(s);
	}

}

/*class qb7{
	public static void main(String h[]){
		
		Scanner sc=new Scanner(System.in);

		int num=0;
		int total=0;
		
		do{
		System.out.println("Enter the number");

		num=sc.nextInt();
	
		try{
			
			if(num%2==1)
				throw new odd_Ex("The number is odd");
			total+=num;
	
		}
		catch(odd_Ex e){
			System.out.println(e);
		}

		}while(num!=0);

		System.out.println("The total is: "+total);
	}
}*/

class qb7{
	public static void main(String h[]){
		int i=0;
		int num=0;
		int total=0;
		
		while(Integer.parseInt(h[i])!=0	){

			num=Integer.parseInt(h[i]);
			
			i++;
			
			try{
				if(num%2==1)
					throw new odd_Ex("The number is odd");
				else
					total+=num;
	
			}			
			catch(odd_Ex e){
				System.out.println(e);
			}

		}
		System.out.println("The total is: "+total);
	}
}