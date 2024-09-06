//Write a program to check given number is prime or not

import java.util.*;
class test3{
	public static void main(String [] args){
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number: ");
		a=sc.nextInt();
		
		if(a%a==0 && a%1==0)
		{
			
			System.out.println("This number is prime..");
		}else{
			
			System.out.println("This number is not a prime");
		}
		
	}
}