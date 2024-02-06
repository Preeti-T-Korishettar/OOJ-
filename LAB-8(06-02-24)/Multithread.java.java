import java.util.*;

class threadone implements Runnable
{
	String a;
	threadone(String b)
	{
		a=b;
		Thread t=new Thread(this,a);
		t.start();
	}
    public void run()
	{
		try 
		{
			while(true)
	       {
			System.out.println(a);
			Thread.sleep(10000);
		   }
        }
		catch(InterruptedException e)
		{
			System.out.println(a+"interrupted");
		}
        System.out.println(a+"exiting");
      }
}

class threadtwo implements Runnable
{
	String a;
	threadtwo(String b)
	{
		a=b;
		Thread t=new Thread(this,a);
		t.start();
	}
    public void run()
	{
		try 
		{
			while(true)
	       {
			System.out.println(a);
			Thread.sleep(2000);
		   }
        }
		catch(InterruptedException e)
		{
			System.out.println(a+"interrupted");
		}
        System.out.println(a+"exiting");
      }
}
class mainthread
{
   public static void main(String args[])
   {
	  new threadone("BMSCE");
	  new threadtwo("CSE");
   }
}
		
		
















