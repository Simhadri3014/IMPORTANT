public class ThreadInterruption
{
	public static void main(String[] args)
	{
		
		Thread thread1 = new PrintingThread();
		thread1.start();
		try
		{
			thread1.join();
		}
		catch(InterruptedException exception)
		{
			System.out.println("InterruptedException from catch block");
		}
		System.out.println("End of main method");
	}
}
class PrintingThread extends Thread
{
	public void run()
	{
		try
		{
			
			for(int i = 0 ; i < 5 ; i++)
			{
				System.out.println("Hi, Good Morning!");
				Thread.sleep(5000);
			}
		}
		catch(InterruptedException exception)
		{
			System.out.println("InterruptedException from catch block");
		}
	}
}