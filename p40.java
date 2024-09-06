//replace method 
import java.util.*;
class p40 {
	public static void main( String [] args){
		String sen, fw,rw;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		sen=sc.nextLine();
		System.out.print("Find Whta? : ");
		fw=sc.nextLine();
		System.out.print("Replace with : ");
		rw=sc.nextLine();
		System.out.println("Modify sentence: "+sen.replace(fw,rw));
		
		
		
	}
}