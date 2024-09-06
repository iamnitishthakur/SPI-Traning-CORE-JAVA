//WAP to greatest number in two unequal number 
import java.util.*;
class p7{
	
	public static void main(String [] args){
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ener You number : ");
		a=sc.nextInt();
		
		System.out.println("Ener You Second : ");
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println("Greatest number: "+a);
		}else{
			
			System.out.println("Greatest number: "+b);
		}
	}
}