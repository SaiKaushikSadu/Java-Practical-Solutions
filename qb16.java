import java.util.*;

class qb16{
	
	int count_char(String s){
		if(s.length()>=10)
			return 1;
		else
			return 0;
	}
		
	int count_dig(String s){
		int countd=0;
	
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>= '0' && s.charAt(i)<='9')
				countd++;
		}		

		if(countd>=2)
			return 1;
		else 	
			return 0;		
	}

	int char_dig(String s){		
		int flag=0;
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)>= '0' && s.charAt(i)<='9') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z')){
				flag=1;
			}
			else{
				flag=0;
				break;
			}
		}

		if(flag==1)
			return 1;
		else
			return 0;
	}
	
	int caps(String s){
		if(s.charAt(0)>='A' && s.charAt(0)<='Z')
			return 1;
		else 
			return 0;
	}

	void check(String s){
		if((count_char(s)==1) && (count_dig(s)==1) && (char_dig(s)==1) && (caps(s)==1))
			System.out.println("Valid password");
		else
			System.out.println("Invalid password");
	}

	public static void main(String h[]){
		Scanner sc=new Scanner(System.in);

		String pass;
		System.out.println("Enter your password");
		pass=sc.nextLine();

		qb16 o=new qb16();

		/*System.out.println(o.count_char(pass));
		System.out.println(o.count_dig(pass));
		System.out.println(o.char_dig(pass));
		System.out.println(o.caps(pass));*/

		o.check(pass);
					
	}
}