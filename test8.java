//8.WAP to division two number Also handle InputMismatchException and ArithmeticsException
//WAP to find division of two numbers
import java.util.*;
class test8{
public static void main(String [] args){
int a,b,c;
Scanner sc= new Scanner(System.in);
try{
System.out.print("Enter your frist number: ");
a=sc.nextInt();

System.out.print("Enter your second number: ");
b=sc.nextInt();
c=a/b;
System.out.println("result: "+c);
}
catch(InputMismatchException ex1){
System.out.print("Pls type only numbers..");
}
catch(ArithmeticException ex2){
System.out.print("Are you trying to divide by zero ?....");
}
finally{
System.out.print("This is final Block....");

}
}
}