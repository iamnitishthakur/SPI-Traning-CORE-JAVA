import java.util.Scanner;
import mypackage.Ourpackage;
class mypackage1{
public static void main(String [] args){
int x,y,z;

Scanner sc=new Scanner(System.in);
Ourpackage or = new Ourpackage();
System.out.print("Enter your frist number: ");
x=sc.nextInt();


System.out.print("Enter your frist number: ");
y=sc.nextInt();

z=or.add(x,y);
System.out.println("Sum="+z);
z=or.sub(x,y);
System.out.println("Sub="+z);
z=or.mul(x,y);
System.out.println("Mul="+z);
z=or.div(x,y);
System.out.println("Div="+z);

}

}
