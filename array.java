//WAPto print the element od an array present on even position and odd position.

import java.util.*;

public class array {
    public static void main(String[] args) {
int [] numbers =new int [10];
Scanner sc= new Scanner(System.in);
System.out.println("Enter your ten numbers : ");
for(int i=0 ; i<10;i++)
{
numbers[i] = sc.nextInt();

}
System.out.print("Even Position numbers: ");
for(int i=0; i<10; i=i+2)
{
System.out.print(numbers[i]+" ");


}

System.out.print("\nodd Position numbers: ");
for(int i=1; i<10; i=i+2)
{
System.out.print(numbers[i]+" ");

}

}
}
