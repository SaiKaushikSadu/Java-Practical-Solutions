import java.util.*;

class qb11{
	public static void main(String h[]){
	
		Scanner sc=new Scanner(System.in);	
		String s;
		s=sc.nextLine();	
		String temp=s.toUpperCase();
		
		for(int i=0;i<s.length();i++){
			if(i==0){
				System.out.print(temp.charAt(i));
				continue;
			}
			if(s.charAt(i-1)==' '){
				System.out.print(temp.charAt(i));
				continue;
			}
			System.out.print(s.charAt(i));
		}
	}
}