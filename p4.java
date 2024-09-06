// WAP to Convert temprature form cetigrate to fahrenhite
import java.util.*;
class p4{
	
	public static void main(String [] args)
	{
		
		double c, f;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter You cetprature in cetigrate");
		c=sc.nextDouble();
		
		f=(c*9)/5+32;
		
		System.out.println("Your tempraturein fahrenhite: "+f);
		
	}
}