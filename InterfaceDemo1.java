//WAP to understarnd concept of interface in java

interface MyInterface{
void m1();//public abstract void m1();
void m2();//public abstract void m2();

}
class TestInterface implements MyInterface{
public void m1()

{
System.out.println("This message form m1() method ");

}
public void m2(){

System.out.println("This message form m2() method");
}
}
class InterfaceDemo1{
public static void main(String [] args)
{
TestInterface ti=new TestInterface();
ti.m1();
ti.m2();
}
}