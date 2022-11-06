import java.util.*;

class multiplyEx extends Exception{

	multiplyEx(String s){
		super(s);
	}
	
}

class qb6{


	void matrix_mul(int a[][],int b[][]){
		
		int c[][]=new int[a.length][b[0].length];		

		try{

			if(a[0].length!=b.length)
				throw new multiplyEx("The two matrices cannot be multiplied");
					
			for(int i=0;i<a.length;i++){
				for(int j=0;j<b[0].length;j++){
					for(int k=0;k<b.length;k++){
						c[i][j]=a[i][k]*b[k][j];
					}
				}
			}
			
			System.out.println("The resultant matrix is:");
			for(int i=0;i<a.length;i++){
				for(int j=0;j<b[0].length;j++){
					System.out.print(c[i][j]+ " ");
				}
				System.out.println();
			}
		}
		catch(multiplyEx e){
			System.out.println(e);
		}
		
	}		


	public static void main(String h[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the rows and cols of matrix A :");
		int m1=sc.nextInt();
		int n1=sc.nextInt();
		int a[][]=new int[m1][n1];
		
		System.out.println("Enter the elements of matrix A:");
		for(int i=0;i<m1;i++){
			for(int j=0;j<n1;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the rows and cols of matrix B :");
		int m2=sc.nextInt();
		int n2=sc.nextInt();
		int b[][]=new int[m2][n2];
		
		System.out.println("Enter the elements of matrix B:");
		for(int i=0;i<m2;i++){
			for(int j=0;j<n2;j++){
				b[i][j]=sc.nextInt();
			}
		}		

		qb6 o=new qb6();

		o.matrix_mul(a,b);

	}
}