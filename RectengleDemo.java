import java.util.*;

class Rectangle{
int length;
int breadth;
Rectangle(int l , int b){
length = l;
breadth = b;

}
public int area(){
return length*breadth;
}
}

class RectengleDemo{
public static void main(String [] args){
int x, y,z;
Scanner sc=new Scanner(System.in);
System.out.print("Enter lendgth of rectangle  : ");
x=sc.nextInt();

System.out.print("Enter breadth of rectangle: ");
y=sc.nextInt();

Rectangle rect=new Rectangle(x,y);
z=rect.area();
System.out.println("Area of rectangle: "+z);


}
}