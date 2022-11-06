import java.util.*;

class symm extends Exception{
	symm(String s){
		super(s);
	}
}

class qb25{
	public static void main(String h[]){
		Scanner sc=new Scanner(System.in);
		int m,n;	
		System.out.println("Enter the no of rows");
		m=sc.nextInt();
		System.out.println("Enter the no of cols");
		n=sc.nextInt();
		int a[][]=new int[m][n];

		System.out.println("Enter the elements");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		int sum=0;
		int flag=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(a[i][j]==a[j][i]){
					flag=1;
				}
				else{
					flag=0;
					break;
				}
			}
		}
		
		try{
			if(flag==0){
				throw new symm("Not Symmetric");
			}
			else{
				System.out.println("Symmetric");
			
				for(int i=0;i<m;i++){
					for(int j=0;j<n;j++){
						if(i!=j){
							sum=sum+a[i][j];
						}
					}
				}
				System.out.println("The sum of elements is: "+ sum);
			}		
		}
		catch(symm e){
			System.out.println(e);
		}

	}	
}