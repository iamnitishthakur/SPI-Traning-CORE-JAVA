//2. WAP to generate Fibonacci series up to n terms. Where value of n entered by user;
import java.util.*;
class p31{

public static void main(String [] args){
int n1=0,n2=1,n3, n,i ;

Scanner sc=new Scanner(System.in);
System.out.print("How many terms you want in series ? :  ");
n=sc.nextInt(0);

System.out.print(n1+" "+n2+" " );
for(i=1;i<=n-2;i++){
n3=n1+n2;
System.out.print(n3+ " ");
n1=n2;
n2=n3;


}


}
}

