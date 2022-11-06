import java.util.*;

class arrayData{
	Scanner sc=new Scanner(System.in);
	void getData(int a[],int n){
		for(int i=0;i<n;i++)	
			a[i]=sc.nextInt();
	}
}

class match{	
	void check(int a[],int b[],int n1,int n2){
		for(int i=0;i<a.length;i++){
			boolean flag=false;
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j])
					flag=true;
			}
			if(!flag){
				System.out.println("Unequal");
				System.exit(0);
			}
		}
		System.out.println("equal");
	}	
}

class qb21{
	public static void main(String h[]){
		Scanner sc=new Scanner(System.in);

		arrayData o=new arrayData();		

		System.out.println("Enter the size of the first array:");
		int n1=sc.nextInt();
		int a[]=new int[n1];
		o.getData(a,n1);

		System.out.println("Enter the size of the second array:");
		int n2=sc.nextInt();
		int b[]=new int[n2];
		o.getData(b,n2);
		
		match m=new match();
		m.check(a,b,n1,n2);
		
	}
}