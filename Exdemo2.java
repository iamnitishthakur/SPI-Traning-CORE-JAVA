import java.io.*;
class Exdemo2{
public static void main(String [] args) throws IOException{
int empid;
String empname;
double salary;

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.print("Enter employee Id : ");
empid = Integer.parseInt(br.readLine());

System.out.print("Enter Employee name: ");
empname = br.readLine();

System.out.print("Enter employee salary: ");
salary = Double.parseDouble(br.readLine());

System.out.println("Employee Id="  +empid);
System.out.println("Employee Name="  +empname);
System.out.println("Employee Salary="  +salary);





}


}