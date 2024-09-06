//WAP to to understand concept of constructor 

class Student{

int rollno; // instance variable
String name;// instance variable
double fee;// instance variable

Student(int rollno ,  String name , double fee){

this.rollno=rollno; 
this.name=name;
this.fee=fee;


}

public void show(){

System.out.println("Roll No: "+rollno);
System.out.println("Name: "+name);
System.out.println("Fee: "+fee);


}
}

class classDemo3 {

public static void main(String [] args){
Student s1=new Student(1001, "Nitish", 120000.0);
s1.show();

Student s2=new Student(1002, "Vijay", 150000.);
s2.show();


}
 
}




































