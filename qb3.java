import java.util.*;

class qb3{

	void search(int a[],int n){

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the element that you need to search:");
			int target=sc.nextInt();
		
			int flag=0;
			for(int i=0;i<n;i++){
				if(a[i]==target){
					System.out.println("The element found at index "+i);
					flag=1;
					break;
				}	
				else{
					flag=0;
				}
			}
			
			if(flag==0){
				System.out.println("The element is not present in array");
			}
			
	}

	void remove(int a[],int n){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the element that you need to remove:");
		int target=sc.nextInt();

		int b[]=new int[n-1];
		int i,j;
		
		for(i=0,j=0;i<n;i++){
			if(a[i]==target)
				continue;
			b[j++]=a[i];
		}

		for(i=0;i<n-1;i++){
			System.out.print(b[i]+" ");										//1 2 3 4 5
		}
	}

	void insert(int a[],int n){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element that you need to insert");
		int ele=sc.nextInt();
		System.out.println("Enter the index at which you need to insert");
		int index=sc.nextInt();

		int c[]=new int[n+1];
		int i,k;
		for(i=0,k=0;i<n;i++){
			if(i==index)
				c[k++]=ele;
			c[k++]=a[i];
		
		}	

		for(i=0;i<n+1;i++){
			System.out.print(c[i]+" ");
		}
	}

	void min_max(int a[],int n){
		int temp;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

		System.out.println("The maximum element in array is: "+a[n-1]);
		System.out.println("The minimum element in array is: "+a[0]);
	}

	
	public static void main(String h[]){
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();	
		
		int a[]=new int[n];
		
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		

		qb3 o=new qb3();

		o.search(a,n);
		System.out.println();
		o.remove(a,n);
		System.out.println();
		o.insert(a,n);
		System.out.println();
		o.min_max(a,n);
			
	}
}