////WAP to find sum of towo numbers by using user define method.
import java.util.*;
class p45{
	static int sum(int x, int y)
	{
		return(x+y);
		
	}
	public static void main(String [] args ){
		int x, y, res;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your frist number : ");
		x=sc.nextInt();
		
		System.out.print("Enter your second number : ");
		y=sc.nextInt();
		res=sum(x,y);
		System.out.println("Add your value: "+res);
		
	}
	
	
}