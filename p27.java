//WAP to find tha factorial of given number  ;

import java.util.*;
class p27 {
public static void main(String [] args){
int n, f=1;
Scanner sc=new Scanner(System.in);

System.out.print("Enter Your number to find the fectorial  : ");
n=sc.nextInt();
while(n>0){
f=f*n;
n--;
}
System.out.println("This is your factorial  number : "+f);

}
}