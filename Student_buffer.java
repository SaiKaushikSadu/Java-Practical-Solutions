import java.io.*;

class Student_buffer{
	public static void main(String[] h)throws Exception{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter the name:");
		String name=br.readLine();
		System.out.println("Enter the roll no:");
		int roll=Integer.parseInt(br.readLine());
		System.out.println("Enter the avg marks:");
		float marks=Float.parseFloat(br.readLine());

		if(marks>35){
			System.out.println("Pass");
		}
		else{
			System.out.println("fail");
		}					
	}
}