import java.util.*;

class wrongAns extends Exception{
	wrongAns(String s){
		super(s);
	}
}

class qb17{
	public static void main(String h[]){
		Scanner sc=new Scanner(System.in);

		String ans;
		System.out.println("Who is the Prime Minister of India?");
		int count=0;
		while(count<3){
			System.out.println("Enter your ans:");
			ans=sc.nextLine();
	
			try{
				ans=ans.toLowerCase();
				if(ans.equals("modi")){
					System.out.println("Excellent");
					System.exit(0);
				
				}
				else{
					count++;
					
					if(count==1)
						throw new wrongAns("Try Again....This is your Second Attempt");
					else if(count==2)
						System.out.println("Wrong ans again...\nThe correct Ans is :Modi");
						System.exit(0);
				}
			
			}
			catch(wrongAns e){
				System.out.println(e);
			}
		}
	}
}