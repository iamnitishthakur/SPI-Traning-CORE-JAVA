// 25. Maximun and  inimum number in array 

import java.util.*;
class p26{
public static void main(String [] args){

int [] list=new int [10];
int i;
Scanner sc=new Scanner (System.in);

System.out.println("Enter two numbers to the list");
for(i=0; i<list.length; i++){

list[i]=sc.nextInt();
}
Arrays.sort(list);
System.out.println("Minimum Number : "+list[0]);
System.out.println("Minimum Number : "+list[list.length-1]);

}
}
