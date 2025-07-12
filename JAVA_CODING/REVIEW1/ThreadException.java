import java.lang.InterruptedException;
public class ThreadException
{
  public static void main(String[] args)
   {
     Thread t1 = new PrintingThread();
     t1.start(); 
     try
      {
        t1.join();    
      } 
     catch(InterruptedException e) 
      {
        System.out.println("Interrupted Exception from catch block");
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
         for(int i=0;i<5;i++)
          {
            System.out.println("Hi, Good Morning!");
            System.out.println("Sleep for 5 Secs");
            Thread.sleep(5000);         
          }       
       }
      catch(InterruptedException e)
       {
         System.out.println("Interrupted Exception from catch block");
       }
    }
 }