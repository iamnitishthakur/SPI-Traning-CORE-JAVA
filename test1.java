//1.WAP a java program to find greatest number in three unequal numbers.
import java.util.*;
class test1{
	public static void main(String [] args){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your frist number: ");
		a=sc.nextInt();
		System.out.println("Enter your second number: ");
		b=sc.nextInt();
		System.out.println("Enter your third number: ");
		c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("Greatest number= "+a);
		}else if(b>c && b<a){
			System.out.println("Second Greatest number= "+b);
			
		}else{
			System.out.println("Smallest number= "+c);
		}
	}
	
	
}