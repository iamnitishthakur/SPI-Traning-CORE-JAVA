import java.util.*;

class demo{
public static void main(String [] args){
int a, b, c ,total,rol;
String name;
double per;


Scanner sc=new Scanner(System.in);
 
System.out.print("Enter your name: ");
name=sc.nextLine();

System.out.print("Enter your Roll no: ");
rol=sc.nextInt();


System.out.print("Enter your 1st subject number: ");
a=sc.nextInt();



System.out.print("Enter your 2nd subject number: ");
b=sc.nextInt();

System.out.print("Enter your 3rd subject number: ");
c=sc.nextInt();

total=(a+b+c);
per= (total*100)/300;
System.out.print("\nTotal Marks: "+total);

System.out.print("\nPercentage: "+per);



if(per>=60){

System.out.print("\nFrist division");



}else if( per==50 || per<50){

System.out.print("\nSecond division");

}
else{

System.out.print("\nThird division");




}

}

}
