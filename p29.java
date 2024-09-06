// WAP to print number  from 1 to 10 ; 


import java.util.*;
class p29{
public static void main(String [] args )
throws InterruptedException
{
int c=100;
Scanner sc= new Scanner(System.in);


do{
System.out.println(c);

Thread.sleep(1000);
c--;

}
while(c>0);

}
}