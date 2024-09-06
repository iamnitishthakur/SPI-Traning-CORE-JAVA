//1. WAP to take coordinates of a point and input and find quadrant.;
import java.util.*;
class p13{
	public static void main(String [] args){
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your x values : ");
		x=sc.nextInt();
		
		Scanner.out.print("Enter your y values : ");
		y=sc.nextInt();
		
		if(x>0 && y>0){
			
			System.out.printf("The point (%d ,%d ) is in frist quadrant\n ",x,y);
			
		}else if(x<0 && y>0)
		{
			System.out.printtf("The point (%d , %d) is in secont quadrant\n",x,y);
			
		}else if (x<0 && y<0)
		{
			system.out.printf("The point (%d, %d) is in third quadrant\n",x,y);
		}
			else if(x>0 && y<0 ){
				System.out.printf("The point (%d, %d)is in four quadrant\n",x,y);
				
			}
			else if(x==0 && y==0){
				System.out.printf("This point (%d ,%d )is origien\n",x,y);
				
			}
			else {
				system.out.printf("This point is at x-axis or y-axisa\n");
			}
		}
	
}