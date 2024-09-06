//WAP to find division of two numbers
import java.util.*;
class Exdemo1{
public static void main(String [] args){
int x,y,z;
Scanner sc= new Scanner(System.in);
try{
System.out.print("Enter your frist number: ");
x=sc.nextInt();

System.out.print("Enter your second number: ");
y=sc.nextInt();
z=x/y;
System.out.print("result: "+z);
}
catch(InputMismatchException ex1){
System.out.print("Pls type only numbers..");
}
catch(ArithmeticException ex2){
System.out.print("Are you trying to divide by zero ?....");
}
finally{
System.out.print("This is final Block....")

}
}
}