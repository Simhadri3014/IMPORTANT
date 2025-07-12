class MyThread extends Thread
{
	public void run()
	{
		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.println("Hi. Good Morning!.....");
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException exception)
			{
				System.out.println("InterruptedException is occurred....");
			}
		}
	}
}
class ThreadInterruption
{
	public static void main(String[] args)
	{
		Thread thread1 = new MyThread();
		thread1.start();
	}
}