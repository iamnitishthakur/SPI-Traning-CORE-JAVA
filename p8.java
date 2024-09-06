//WAP to find greatest number : 
import java.util.*;
class p8 {
	public static void main(String [] args ){
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your First: ");
		a=sc.nextInt();
		
		System.out.println("Enter Your Second : ");
		b=sc.nextInt();
		
		System.out.println("Enter Your Third: ");
		c=sc.nextInt();
		
		if(a>b && a>c){
			
			
			System.out.println("Greatest number: "+a);
		}
		else if(b>a && b>c){
			
			System.out.println("Greatest Number: "+b);
		}
	
		else{
			
			System.out.println("Greatest Number: "+c);
		
	}
	
	}
	
}