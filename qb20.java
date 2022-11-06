import java.util.*;

class qb20{
	public static void main(String h[]){
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.nextLine();
		int n=str.length();
		char[] s=str.toCharArray();
		//String temp="";
		char t;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				
				if(s[j]>s[j+1]){
					t=s[j];
					s[j]=s[j+1];
					s[j+1]=t;
				}

			}		
		}
		for(int i=0;i<n;i++)
			System.out.print(s[i]);
	}
}