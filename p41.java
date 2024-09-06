//WAP to count the  vowel in a String ;

import java.util.*;

class p41{
	public static void main(String [] args ){
		
		String str;
		int i , c=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your String: ");
		str=sc.nextLine();
		
		for(i=0; i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'|| ch=='E' || ch=='i'||ch=='I'|| ch=='o'||ch=='O'|| ch=='u'||ch=='U'){
				c++;
				
			}
			

			
			
			
			
		}
					System.out.println("Number of vowel : "+c);
		
	}
	
	
	
}