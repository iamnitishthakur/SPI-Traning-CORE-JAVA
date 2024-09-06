// WAP  to print a reverse digits of given number : 


import java.util.*;

class p14{

public static void main(String [] args){
int num, rev=0, rem;

Scanner sc=new Scanner(System.in);

System.out.println("Enter your number : ");
num=sc.nextInt();
while(num>0){

rem=num%10;
rev=rev*10+rem;
num=num/10;

}
System.out.println("This is your reverse number: "+rev);



}

}