//WAP to convert temprature form fahrenheit to centigrade
import java.util.*;
class p5{
	public static void main(String [] args){
		
		double c,f;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter you fahrenheit");
		f=sc.nextDouble();
		
		c=(f-32)*5/9;
		System.out.println("You Temprature in centigrade: "+ c);
	}
	
	
	
}