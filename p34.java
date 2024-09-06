// WAP to store five number in list and display numbers in sorted order;


import java.util.*;
class p34{
public static void main(String [] args)
{
int [] arr=new int[5];
int i;
Scanner sc=new Scanner(System.in);
System.out.print("Enter five number in list: ");

for(i=0; i<5; i++){
arr[i]=sc.nextInt();
}
Arrays.sort(arr);
System.out.println("Number in sorted order: ");
for(i=0;i<5;i++){
System.out.println(arr[i]);
}

}


}


