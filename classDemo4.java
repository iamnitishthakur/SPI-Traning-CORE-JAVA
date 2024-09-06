//WAP to create inheritance.

class Rundog{

public static void bark(){
System.out.println("Tommy: ");
System.out.print("bhau............bhau......");

}
}

class Bulldog extends Rundog{
public void growl(){



System.out.print("\nTuffy................");
System.out.print("\nGurr...........gurr.......");

}
}
class classDemo4{


public static void  main(String [] args){
Bulldog dog=new Bulldog();
dog.bark();
dog.growl();


}
}

