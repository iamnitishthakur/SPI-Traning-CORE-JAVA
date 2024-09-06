//WAP to find sum of digits of given number;
import java.util.*;

class p11{
	public static void main(String [] args ){
		int n, d , sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number: ");
		n=sc.nextInt();
		//if(n%2==0){
		//	System.out.print("This is a sum numbers: "+n);
		//}else{
			//System.out.print("This is not a sum numbers : ");
		//}
		while(n>0){
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("Sum of digits : "+sum);
		
		}
}
