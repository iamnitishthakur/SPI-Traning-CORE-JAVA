//BANKING SYSTEM APPLICATION....
import java.io.*;

class Bank{
long accountno;
String name;
double balence;
Bank(int accountno, String name, double balence){
this.accountno=accountno;
this.name=name;
this.balence=balence;
}
public void deposite(int acno, double amt){
	if(accountno==acno){
		balence=balence+amt;
		System.out.println("Ammount "+amt+" is created in account "+acno);
		
	}else{
		System.out.println("Account doesn't exists..");
		
	}
	
}public void withdraw(int acno, double amt){
	if(accountno==acno){
		if(balence>=amt){
			balence=balence-amt;
			System.out.println("Amount"+amt+ "is debited from account "+acno);
			
		}else{
			System.out.println("Insufficient balence");
			
		}
		
	}
	else{
		System.out.println("Accout does not exists..");
		
	}
}
public void enquiry(int acno){
	if(accountno==acno){
		System.out.println("Balence= "+balence);
		
	}else{
		System.out.println("Accoun Does not exists");
		
	}
}
}
class bankSystem{
	public static void main(String [] args) throws IOException{
		int acno, ch=0;
		String name;
		double bal, amt;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Account Number: ");
		acno=Integer.parseInt(br.readLine());
		
		System.out.print("Enter Account Holder Name: ");
		name=br.readLine();
		
		System.out.print("Enter Opening Balence: ");
		bal=Double.parseDouble(br.readLine());
		
		
		Bank b=new Bank(acno,name,bal);
		System.out.println("Account is Created..");
		
		while (ch!=4){
			System.out.println("1: Deposite..");
			System.out.println("2: Withdraw..");
			System.out.println("3: Enquery..");
			System.out.println("4: Exit..");
			System.out.println("___________________");
			
			ch=Integer.parseInt(br.readLine());
			switch(ch){
				case 1:
				System.out.println("Enter Account Number: ");
				acno=Integer.parseInt(br.readLine());
				System.out.print("Enter Amount to debited: ");
				amt=Double.parseDouble(br.readLine());
				b.deposite(acno, amt);
				break;
				
				case 2:
				System.out.println("Enter Account Number: ");
				acno=Integer.parseInt(br.readLine());
				System.out.print("Enter Amount to Withdraw: ");
				amt=Double.parseDouble(br.readLine());
				b.withdraw(acno,amt);
				break;
				
				case 3:
				System.out.println("Enter Account Number: ");
				acno=Integer.parseInt(br.readLine());
				System.out.print("Enter Amount to Enquiry: ");
				amt=Double.parseDouble(br.readLine());
				b.enquiry(acno);
				break;	
				
				case 4:
				break;
				default:
				System.out.println("Invalid choice....");
				
			}
		}
		
		
	}
	
}


