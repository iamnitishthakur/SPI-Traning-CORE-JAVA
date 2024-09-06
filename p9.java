//WAP to use Switch cases
import java.util.*;
class p9{
	public static void main(String [] args ){
		int day;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Days number: ");
		day=sc.nextInt();
		//System.out.println("Enter Your Condition: ");
		//con=sc.nextInt();
		
		switch(day){
		case 1:
		System.out.println("Sunday");
		
		break;
		
		case 2:
		
		System.out.println("Monday");
		break;
		
		case 3: 
		System.out.println("Tuesday");
		break;
		
		case 4:
		System.out.println("Wednesday");
		break;
		
		case 5:
		System.out.println("Thrusday");
		break;
		
		case 6:
		System.out.println("Friday");
		break;
		
		case 7: 
		System.out.println("Saturday");
		break;
		default:
		}
	}
}