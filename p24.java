//23. WAP to create an array of 10 numbers by user input. Now search a number in array.

import java.util.*;

class p24{

public static void main (String [] args ){
int [] arr=new int[10];

int i, n, f=0;
Scanner sc=new Scanner (System.in);

System.out.println("Enter ten Numbers for array : ");
for(i=0; i<10; i++){
arr[i]=sc.nextInt();

}

System.out.println("Enter a number to search : ");
n=sc.nextInt();
for(i=0; i<10; i++){
if(arr[i]==n){

f=1;
break;
}
}

if(f==1){

System.out.println("Number is found at location"+(i+1));
}
else
{

System.out.println("Number is not found ");

}
}
}


