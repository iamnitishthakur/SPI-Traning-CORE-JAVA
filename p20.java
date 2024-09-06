//20. WAP to compare  two String for equality.
import java.util.*;

class p20{

public static void main(String [] agrs){

String str1 , str2;

Scanner sc=new Scanner(System.in);
System.out.print("Enter First String : ");
str1=sc.nextLine();

System.out.print("Enter Second String : ");
str2=sc.nextLine();
if(str1.equalsIgnoreCase(str2)){


System.out.print("Both String are Equals: ");
}
else{

System.out.print("Both String are Not Equals : ");
}
}
}