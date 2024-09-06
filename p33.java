//WAP to find sun and average of ten numbers using array;

import java.util.*;
class p33{

public static void main(String [] args){
int [] arr=new int[10];

Scanner sc=new Scanner(System.in);
int i,sum=0;
double avg;

System.out.print("Enter ten number : ");
for(i=0; i<10;i++){
arr[i]=sc.nextInt();
sum=sum+arr[i];


}
avg=(float)sum/10;
System.out.println("Sum= "+sum);
System.out.println("Average= "+avg);


}
}

