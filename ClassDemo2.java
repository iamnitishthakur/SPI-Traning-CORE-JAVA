class Employee
{
int empid; //instance variable
String empname; //Instance variable
double salary; //Instance variable
public void setValue(int eid, String ename, double sal){

empid=eid;
empname=ename;
salary=sal;


}

public void display()
{
System.out.println("Employee Id= "+empid);
System.out.println("Employee Name= "+empname);
System.out.println("Employee salary= "+salary);


}
}
class ClassDemo2{

public static void main(String [] args){

Employee e1=new Employee();
Employee e2=new Employee();
e1.setValue(1001, "Nitish singh", 50000.0);
e1.display();

e2.setValue(1002, "Ramesh singh", 45000.0 );
e2.display();

}
}








