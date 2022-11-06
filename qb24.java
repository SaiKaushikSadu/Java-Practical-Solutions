import java.util.*;

class otherBranch extends Exception{
	otherBranch(String s){
		super(s);
	}
}

class Student{
	static String cname=new String("TSEC");
	String name,branch;
	int id;

	void getData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.nextLine();
		System.out.println("Enter the ID");
		id=sc.nextInt();
		System.out.println("Enter the Branch");
		branch=sc.next();
	}

	static int count(Student s[]){
		int ans=0;
		for(int i=0;i<s.length;i++){
			if(s[i].branch.equals("comps")||s[i].branch.equals("it")){
				ans++;
			}
		}
		return ans;
	}
}

class qb24{
	public static void main(String h[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the no of students you need to enter");
		int n=sc.nextInt();

		Student s[]=new Student[n];

		for(int i=0;i<n;i++){
			s[i]=new Student();
			s[i].getData();
		
			try{
				if(!(s[i].branch.equals("comps")||s[i].branch.equals("it"))){
					System.out.println("Belongs to "+s[i].branch);
					throw new otherBranch("These peeps are from other branch, not cs or it");
				}
				
			}
			catch(otherBranch e){
				System.out.println(e);
			}
		}
		System.out.println("The total no of student sin cs and it are :"+Student.count(s));	
	}
}