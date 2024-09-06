import java.util.*;
class Figure{

public int area(int s){

return s*s;

}
public int area(int l , int b){
return l*b;
}
}
class classDemo7{
public static void main(String [] args){
int s,l,b,a1,a2; 
Scanner sc=new Scanner(System.in);
Figure fig=new Figure();
System.out.print("Side of square: ");
s=sc.nextInt();
a1=fig.area(s);
System.out.println("Area of square: "+a1);
System.out.println("Enter length of rectrangle: ");
l=sc.nextInt();

System.out.print("Enter breath of rectrangle: ");
b=sc.nextInt();
a2=fig.area(l,b);



System.out.print("Area of rectrangle: "+a2);





}
}



Method overriding-
_____________________

Re-writing of based class method in to derived class in called method Overriding.
Ex:-
class Connection{

public void connect(){

//code to connect oracle database

}
}
class NewConnection extends connection{
public void connect(){
//code to connect MYSQL database;

}

}














