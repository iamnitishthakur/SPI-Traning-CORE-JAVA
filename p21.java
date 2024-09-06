//21. WAP to replace one String with another String in given String .


import java.util.*;

class p21{

public static void main(String [] agrs){
String sen, fw, rw;
Scanner sc=new Scanner(System.in);
System.out.print("Enter Sentence");

sen=sc.nextLine();
System.out.print("Find What ? : ");
fw=sc.nextLine();

System.out.print("Replace with: ");
rw=sc.nextLine();

System.out.print(" Modify Sentence: "+sen.replace(fw,rw));


}
}