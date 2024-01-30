import java.util.Scanner;
class wrongage extends Exception
{
	wrongage(String e)
	{
		super(e);
	}
}
class inputscanner
{
	Scanner s=new Scanner(System.in);
	
}
class father extends inputscanner
{
	int fatherage;
	void father_check() throws wrongage
	{
		System.out.println("Enter age of father\n");
		fatherage=s.nextInt();
		if(fatherage<0)
		{
		     throw new wrongage("Age cannot be negative");
		}
	}
        void display()
	{
		System.out.println("Age of the father is "+fatherage);
	}
	
}
class son extends father
{
	int sonage;
	void son_check() throws wrongage
	{
	System.out.println("Enter age of son\n");
	sonage=s.nextInt();
		if(sonage>fatherage)
		{
			throw new wrongage("Age of son cannot be greater then father");
		}
		else if(sonage<0)
		{
			throw new wrongage("Age of son cannot be negative");
		}
	}
        void display()
	{
		System.out.println("Age of the father is "+sonage);
	}
	
}

class main
{
	public static void main(String[] args)
	{
	father f=new father();
	son s=new son();
		try
		{
			f.father_check();
			f.display();
			s.son_check();
			s.display();
		}
		catch(wrongage e)
		{
			System.out.println("Exception caught");
		}
	}
}
	
			









		
