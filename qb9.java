import java.util.*;

class first extends Thread{
	public void run(){	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the num of elements:");	
		int n=sc.nextInt();
		int sum=0;

		for(int i=1;i<=n;i++){		
			sum+=i;
			System.out.println(sum);

			try{
				Thread.sleep(10);
			}
			catch(Exception e){
		
			}
		}
	}
}

class second implements Runnable{
	public void run(){
		for(int i=0;i<20;i++){
			if(i%2==0){
				System.out.println(i);
			}
			try{
				Thread.sleep(10);
			}
			catch(Exception e){

			}
		}
	}
}

class qb9{
	public static void main(String h[]){

		first f=new first();
		f.setPriority(5);
		f.start();
		
		second s=new second();
		Thread t=new Thread(s);
		t.setPriority(7);
		t.start();		
	}
}