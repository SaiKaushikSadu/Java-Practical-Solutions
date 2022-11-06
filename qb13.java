import java.util.*;

class qb13{
	
	void common_ele(int a[],int b[]){
		System.out.println("The common elements are:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					System.out.println(a[i]);
				}
			}
		}
	}

	void remove_duplicate(int a[]){
		int n=a.length;

		Arrays.sort(a);

		int temp[]=new int[n];
			
		int j=0;
		for(int i=0;i<n-1;i++){
			if(a[i]!=a[i+1]){
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[n-1];
		
		System.out.println("The array after removal of duplicate elements are:");
		for(int i=0;i<j;i++)
			System.out.print(temp[i]+" ");
	}

	void second_max(int a[]){
		Arrays.sort(a);
		int n=a.length;
		System.out.println("The second largest element is : "+a[n-2]);
	}

	void second_min(int a[]){
		Arrays.sort(a);
		int n=a.length;
		System.out.println("The second largest element is : "+a[2]);
	}
	
	public static void main(String h[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
	
		System.out.println("Enter the elements of the array");
		int b[]=new int[n];
		for(int i=0;i<n;i++)
			b[i]=sc.nextInt();

		qb13 o=new qb13();

		o.common_ele(a,b);
		
		o.remove_duplicate(a);
		o.remove_duplicate(b);

		o.second_max(a);
		o.second_max(b);

		o.second_min(a);
		o.second_min(b);
		
	}
}