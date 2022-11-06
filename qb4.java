import java.util.*;

class qb4{

	void remove_spaces(String s){
		
		String result="";

		s=s.trim();
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				result+=s.charAt(i);

				while(s.charAt(i+1)==' ')
					i++;
				continue;
			}
			result+=s.charAt(i);
		}

		System.out.println("The final string after removal of spaces is :"+result);
	}

	void count_vowels(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			count++;
		}
		System.out.println("The number of vowels in string are :" +count);
	}

	public static void main(String h[]){
		Scanner sc=new Scanner(System.in);
		
		String s;
		s=sc.nextLine();

		qb4 o=new qb4();
		o.remove_spaces(s);	
		System.out.println();
		o.count_vowels(s);
		
	}
}
