import java.util.Scanner;

class Account
{
	String cust_name;
	String acc_no;
	int acc_type;
	Scanner s=new Scanner(System.in);
	void get()
	 {
	   System.out.println("Enter the customer name:");
	   cust_name=s.next();
	   System.out.println("Enter the account number:");
	   acc_no=s.next();
	 }
	void get1()
	 {
	  System.out.println("Enter the account type:\n1:Savings\n2:Current account");
	   acc_type=s.nextInt();
	 }
}
class Cur_acc extends Account
{
	double balance=0;
	double deposit;
	void accept_dep()
	{
	 System.out.println("Enter the amount to be deposited");
	 deposit=s.nextInt();
	 balance=balance+deposit;
	 System.out.println("Amount"+deposit+" is succesfully deposited");
	}
	void cheque()
	{
	 System.out.println("Enter the amount to be provided in cheque book");
	 s.nextInt();
	 System.out.println("The cheque book is issued succesfully");
	}
	void ch_bal()
	{
	 if(balance>=500)
	  {
	    System.out.println("The balance amount is"+balance+"");
	  }
	 else
	  {
	    System.out.println("balance is less than minimum balance amount");
	    balance=balance-5;
 		System.out.println("Service charge is imposed and the current balance is"+balance);
	  }
	 }
	
}

class Sav_acc extends Account
{
	double balance=0;
	double deposit,withd;
	int rate=6;

	void deposit()
	{
	 System.out.println("Enter the amount to be deposited");
	 deposit=s.nextInt();
	 balance =balance+deposit;
	 System.out.println("Amount"+deposit+" is succesfully deposited");
	}
	void withdrawal()
	{
	 System.out.println("Enter the amount to withdraw");
	 withd=s.nextInt();
	 balance=balance-withd;
	 System.out.println("The balance amount is"+balance);
	}
	void comp_interest()
	{
	 balance=balance+balance*0.05;
     System.out.println("The balance amount is"+balance);
	}
}

class bank
{
  public static void main(String args[])
  { 
    Scanner s1=new Scanner(System.in);
    int ch;
	Account b=new Account();
	b.get();
	Sav_acc a=new Sav_acc();
	Cur_acc c=new Cur_acc();
    do
    {
      b.get1();
	  if(b.acc_type==1)
      {
	     do
	    {
		  System.out.println("-----Menu-----");
		  System.out.println("Enter the choice\n1:deopsit\n2:Withdrw\n3.Compound interest");
	      ch=s1.nextInt();
           switch(ch)
	       {
				case 1:
					a.deposit();
					break;
				case 2:
					a.withdrawal();
					break;
				case 3:
					a.comp_interest();
					break;
		   }
		} while(ch!=4);
     }
     else
     {
	    do
	    {
		  System.out.println("-----Menu-----");
		  System.out.println("Enter the choice\n1:deopsit\n2:Issue cheque\n3.check balance");
	      ch=s1.nextInt();
           switch(ch)
	       {
				case 1:
					c.accept_dep();
					break;
				case 2:
					c.cheque();
					break;
				case 3:
					c.ch_bal();
					break;
		   }
		}while(ch!=4);
      }
     }
     while(b.acc_type!=3);
   }
}


			
		

	
	 	
	 
	 
	
	
	
	
	 