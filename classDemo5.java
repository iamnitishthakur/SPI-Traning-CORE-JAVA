//Multi-level inheritance; 

import java.util.*;

class Shape{

int s; //instance variables 
public void setValue(int side){
s=side;
}
}

class Square extends Shape{
public int area()
{
return  s*s;
}
}
class Cube extends Shape{

public int volume(){
return s*s*s;

}
}


class classDemo5{

public static void main(String [] args){

int s, a,v;
Scanner sc=new Scanner (System.in);

Square sq=new Square();
System.out.print("Enter side of Square: ");
s=sc.nextInt();

sq.setValue(s);
a=sq.area();
System.out.println("Area of square: "+a);

Cube cu=new Cube();
System.out.print("Enter side of Cube: ");
s=sc.nextInt();

cu.setValue(s);
v=cu.volume();


System.out.println("Volume of cube: "+v);













}
}




