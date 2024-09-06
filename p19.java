//19.WAP to take user name as input  now display name in upper case, lower case and find its length.


import java.util.*;

public class p19{

public static void main(String [] args){

String name; 

Scanner sc=new Scanner(System.in);
System.out.print("Enter your name: ");

name=sc.nextLine();
System.out.println("Name in upper case: "+name.toUpperCase());
System.out.println("Name in upper case: "+name.toLowerCase());
System.out.println("Length in in your name : "+name.length());


}
}



