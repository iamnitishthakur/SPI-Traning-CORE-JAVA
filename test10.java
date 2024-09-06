//10.WAP to print table of given number .//	error

import java.util.*;
class test10{
	
	public static void main(String [] args){
	int n,a,i;	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your number: ");
		
		n=sc.nextInt();
		for(i=1; i<10; i++){
			a=n*i;
			System.out.println("Table of given number= "+a);
		}
		
	
		
	}
	
}