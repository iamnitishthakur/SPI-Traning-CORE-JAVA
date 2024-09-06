//WAP to temprature converter based on user choise ;
import java.util.*;
class p012{
public static void main(String []  args){
	Double  f,c;
int ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("C to f Press  no. 1");
	System.out.println("f to c Press  no. 2");
		System.out.println("Enter your choise : ");
		ch=sc.nextInt();

		

	
	switch(ch)
	
	{
		case 1:
		
		System.out.println("Enter your tempratiure in : ");
		c=sc.nextDouble();
		f=(9*c)/5+3;
	
			System.out.println(" tempratiure  in c : " +f);
break;
		case 2: 
		System.out.println("Enter your tempratiure in f: ");
		f=sc.nextDouble();
			c=(f-32)*5/9;
		System.out.println(" tempratiure  in c : " +f);

break;

default: 
System.out.printf("Invaild case");
		
	}
		
	
}
}