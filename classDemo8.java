//Overriding method

class X{

public void m1(){

System.out.println("m1 of X");
}
public void m2(){
System.out.println("m2 of X");

}
}
class Y extends X{
public void m1(){
System.out.println("m1 of Y");


}
public void m3(){
System.out.println("m3 of Y");


}

}
class classDemo8{
public static void main(String [] args){

X x=new X();
x.m1(); 
x.m2(); 
Y y=new Y();
y.m1();
y.m2();
y.m3();


}
}


















