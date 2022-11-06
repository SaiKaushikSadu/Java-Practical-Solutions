import java.util.*;

class medicine{
	Scanner sc=new Scanner(System.in);
	String med_name;
	int rate,qty;
	int price;
	
	void getMed(){
		System.out.println("Enter the medicine name:");
		med_name=sc.nextLine();
		System.out.println("Enter the rate of medicine:");
		rate=sc.nextInt();
	}

	int gettotal(int quty){
		qty=quty;
		price=rate*qty;
		return price;
	}

}

class qb5{
	public static void main(String h[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of medicine you need to store:");
		int n=sc.nextInt();
		medicine m[]=new medicine[n];
		for(int i=0;i<n;i++){
			m[i]=new medicine();
			m[i].getMed();
			//m[i].gettotal();
		}

		int medQty;
	
		for(int i=0;i<n;i++){
			System.out.println("Enter the quantity of :"+m[i].med_name+" you need");
			medQty=sc.nextInt();
			m[i].gettotal(medQty);
		}
		
		System.out.println("Name\t|Rate\t|QTY\t|Price");
		for(int i=0;i<n;i++){
			System.out.println(m[i].med_name+"\t|"+m[i].rate+"\t|"+m[i].qty+"\t|"+m[i].price);
		}
		int total=0;
		for(int i=0;i<n;i++){
			total+=m[i].price;	
		}
		System.out.println("\t\t  Total:"+total);
	}
}