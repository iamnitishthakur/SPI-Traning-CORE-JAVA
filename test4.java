//WAP to store 10 number in array  user input now search a number in array.
import java.util.*;
class test4{
	public static void main(String [] args ){
		
		int [] nums =new int [10];
		int s,f=0;
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your ten number : ");
		for(int j=0; j<10; j++){
			nums[j]=sc.nextInt();
 		}
		System.out.print("Enter number you want to search : ");
		s=sc.nextInt();
		for(int i=0; i<10; i++){
			if(s==nums[i]){
				f++;
			}
		}
		if(f>0){
			System.out.println("Number is found : ");
			
		}else {
			System.out.println("Number is not found: ");
		}
	}
} 