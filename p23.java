// 1. WAP to print series of even number in given range.


import java.util.*;

class p23{
public static void main (String [] args ){

int beg, end, i; 
Scanner sc=new Scanner (System.in);

System.out.print("Enter your Lower limit : ");
beg=sc.nextInt();

System.out.print("Enter your Upper Limit : ");
end=sc.nextInt();

for(i=beg;i<=end ; i++){
if(i%2==0){

System.out.println(i+" ");


}

}
}

}