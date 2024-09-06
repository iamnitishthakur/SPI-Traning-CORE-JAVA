class A{


public void showA(){
System.out.println("This message form A ");


}
}
class B extends A{
public void showB(){
System.out.println("This message from B");

}
}
class C extends B{
public void showC(){
System.out.println("This massage from class C");


}
}
class classDemo6{ 
public static void main(String [] args){

C c=new C();
c.showA();
c.showB();
c.showC();
}
}