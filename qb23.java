import java.util.*;



class qb23{
	public static void main(String h[]){
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.nextLine();
		char ch[]=s.toCharArray();
		int flag=0;
		int i,j;
		for(i=0,j=s.length()-1;i<(s.length()-1)/2;i++,j--){
			if(ch[i]==ch[j]){
				flag=1;
			}
			else {
				flag=0;
				break;
			}
		}	
		
		
		if(flag==0){
			System.out.println("Not a palindrome");
		}
		else{
			System.out.println("Palindrome");
		}
	}
}