import java.util.*;

class not_found extends Exception{
	not_found(String s){
		super(s);
	}
}

class lib{
	String book,author;
	int copy,price;

	Scanner sc=new Scanner(System.in);	

	void getbook(){
		System.out.println("Enter the name of the book");
		book=sc.nextLine();
		System.out.println("Enter the name of the Author");
		author=sc.nextLine();
		System.out.println("Enter the price of the book");
		price=sc.nextInt();
		System.out.println("Enter the no of copies");
		copy=sc.nextInt();
	}
}

class qb22{
	public static void main(String h[]){
		Scanner sc=new Scanner(System.in);
		String name;
	
		System.out.println("Enter the no of book you need to store:");
		int n=sc.nextInt();
		
		lib l[]=new lib[n];
		
		for(int i=0;i<n;i++){
			l[i]=new lib();
			l[i].getbook();
		}

		System.out.println("Enter the name of the book you need to buy:");
		name=sc.next();
		
		int qty;
		int num=0;
		int flag=0;
		for(int i=0;i<n;i++){
			
			if((l[i].book).equals(name)){
				flag=1;
				//System.out.println("Book Found");
				num=i;
				break;
			}
		}
		
		try{

			if(flag==0){
				throw new not_found("Book not found");
			}
			else{
				System.out.println("Book Found");
			
				System.out.println("Enter the no of copies you need");
				qty=sc.nextInt();
				if(qty>l[num].copy){
					System.out.println("Insufficient copies");
				}	
				else{
					System.out.println("Copies Present");
					System.out.println("The total amount to be paid is "+l[num].price*qty);
				}
			}
		}
		catch(not_found e){
			System.out.println(e);	
		}
	}
}
