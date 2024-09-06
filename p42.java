// WAP to take a string as input display reverse string.
import java.util.*;
 class p42{
	 public static void main(String []  args){
		 String str, rev="";
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter your String: ");
		 str= sc.nextLine();
		 
		 for(int i=str.length()-1; i>=0; i--){
			 rev=rev+str.charAt(i);
			 
		 }
		 System.out.println("reverse String "+rev);
		 
		 
	 }
 }