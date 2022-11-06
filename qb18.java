import java.util.*;

class amtEx extends Exception{
	amtEx(String s){
		super(s);
	}
}

class qb18{

	public static void main(String h[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("\t\t\t\t-----------Lets do some transactions----------");
		
		int total_amt=10000;
		int wd,depo;
		int ch,z;

		do{

		System.out.println("1.Withdrawal\n2.Deposit\n3.Balance");
		System.out.println("Enter your choice");
		ch=sc.nextInt();

		switch(ch){
			case 1:
				System.out.println("Enter the amount that you need to withdraw");
				wd=sc.nextInt();
			
				if(wd>total_amt){
					System.out.println("Insufficient Balance");
				}
				else{
					System.out.println("Successful");
					System.out.println("Amount withdrawn is "+wd);
					total_amt-=wd;
					System.out.println("Balance left is: "+total_amt);
				}

				break;

			case 2:

				System.out.println("Enter the amount that you need to deposit");
				depo=sc.nextInt();

				try{
					if(depo>100000){
						throw new amtEx("Sorry Cannot be deposited \nAmount greater than 100000");
			
					}
					else{
						System.out.println("Successfully Deposited");
						total_amt+=depo;
						System.out.println("Total amount in your account is: "+total_amt);
					}
				}
				catch(amtEx e){
					System.out.println(e);
				}
			
				break;
			
			case 3:
				System.out.println("Balance in your account is: "+total_amt);
				break;

			default:
				System.out.println("Entr a valid choice");
			
		}

		System.out.println("Enter 1 to continue and 0 to exit");
		z=sc.nextInt();

		}while(z==1);
	}
}
