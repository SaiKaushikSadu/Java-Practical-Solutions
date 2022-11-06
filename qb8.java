import java.io.*;

class qb8{

	void dig(int s){
		String str=Integer.toString(s);
		
		for(int i=0;i<str.length();i++){
			System.out.print(str.charAt(i)+ " ");
		}
	}
	
	public static void main(String h[])throws Exception{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		int n1,n2;
		int r;

		System.out.println("Enter two numbers:");

		n1=Integer.parseInt(br.readLine());
		n2=Integer.parseInt(br.readLine());

		System.out.println("The sum of two numbers is: "+ (n1+n2));
		System.out.println("The diffrence of two numbers is: "+ (n1-n2));
		System.out.println("The multiplication of two numbers is: "+ (n1*n2));
		System.out.println("The average of two numbers is: "+ ((n1+n2)/2));
		
		if(n1>n2)
				System.out.println("The minimum of two numbers is: "+ n2);
		else
				System.out.println("The minimum of two numbers is: "+ n1);

		if(n2>n1)
				System.out.println("The maximum of two numbers is: "+ n2);
		else
				System.out.println("The maximum of two numbers is: "+ n1);

		qb8 o=new qb8();
	
		System.out.println("The individual digits of first number is: ");
		o.dig(n1);

		System.out.println();
		
		System.out.println("The individual digits of second number is: ");
		o.dig(n2);
		
	}	
}