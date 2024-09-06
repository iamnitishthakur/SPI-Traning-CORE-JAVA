//1.WAP to check even number is prime or not.

import java.util.*;
class p30{

public static void main(String [] args){
int n,i,c=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter your number: ");
n=sc.nextInt();
for(i=1; i<=n; i++){
if(n%i==0){
c++;
}
}
if(c==2) {
System.out.println("Number is prime ");

}
else{

System.out.print("Number is not prime");
}

}


}

