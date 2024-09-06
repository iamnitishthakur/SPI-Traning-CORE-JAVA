//WAP to campare to string for equality.
import java.util.*;
class p38{
	
	public static void main(String [] args){
		
		String str1, str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter frist String : ");
		str1=sc.nextLine();
		
		System.out.print("Enter Second String : ");
		str2=sc.nextLine();
		
		if(str1.equalsIgnoreCase(str2)){
		
		System.out.println("Strint are equals ");
		}else{
			
			System.out.println("Strint are not equals ");
		}
		
	}
}
