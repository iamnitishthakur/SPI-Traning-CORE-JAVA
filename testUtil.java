import java.util.Scanner;
import mypack.Myutil;
class testUtil{
public static void main(String [] args ){
int a,b,s,g;
Scanner sc=new Scanner(System.in);
Myutil m = new Myutil();
System.out.print("Enter frist number: ");
a =sc.nextInt();
System.out.print("Enter second number: ");
b=sc.nextInt();
s=m.add(a,b);
g=m.greatest(a,b);
System.out.println("Sum="+s);
System.out.println("Greatest ="+g);

}

}
