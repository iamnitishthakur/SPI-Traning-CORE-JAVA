//5.Write a java program to check given String is palindrome or not.

import java.util.*;

class test5{
	
	
	public static void main(String [] args){
		String str, rev="";
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your String : ");
	str=sc.nextLine();
	for(int i=str.length()-1; i>=0; i--)
	{
     rev=rev+str.charAt(i);
			 
	}
	System.out.println(" This String is palindrome: "+rev);
			 
			 
			 
		
	}
}