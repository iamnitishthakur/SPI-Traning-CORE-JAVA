//WAP to area of rectangle using method 
import java.util.*;

class p46{
	public static void main(String [] args){
		
		int x,y,z;
		Scanner  sc=new Scanner(System.in);
		System.out.print("Enter length of rectangle: ");
		x=sc.nextInt();
		System.out.print("Enter breath of rectangle: ");
		y=sc.nextInt();
		
		p46 p=new p46();
		z=p.area(x,y);
		System.out.println("Area : "+z);
		
	}
	public int area(int l , int b){
		return (l*b);
		
	}
}
