package practice;

public class MyThread extends Thread {

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				System.out.println("odd number is"+i);
			}
		}
	}
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("even number is"+i);
			}
		}
		MyThread t=new MyThread();
		t.start();

	}

}
