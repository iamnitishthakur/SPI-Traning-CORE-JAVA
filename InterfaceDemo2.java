//Frist meeting..

interface School{
void registration(); //public abstract void resistation();
void feeSumission();//pav feesumission();
void batchAllotment();//pav batchAllotment();
}

//School

abstract class Test1 implements School{
public void registration(){
System.out.println(" Bussiness Logic of registraction: ");

}
}
//Third Meeting..

abstract class Test2 extends Test1{
public void feeSumission(){
System.out.println(" Bussiness Logic of feeSumission: ");

}
}

//Fourth meeting...
class Test3 extends Test2{
public void batchAllotment(){
System.out.println("Business Logic of batchAllotment: ");

}
}
class InterfaceDemo2{
public static void main(String [] args){
Test3 t=new Test3();
t.registration();
t.feeSumission();
t.batchAllotment();

}
}















