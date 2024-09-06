//WAP to print the table of given number;

import java.util.*;
class p28{
public static void main(String [] args){
int n, t, i;
Scanner sc=new Scanner(System.in);
System.out.print(" Enter a number: ");
n=sc.nextInt();

for (i=1 ; i<=10 ; i++ ){
t=n*i;
System.out.printf("%d*%d=%d\n",n,i,t);


}
} 


}