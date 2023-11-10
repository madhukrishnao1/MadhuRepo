package practice;

import java.util.ArrayList;
import java.util.List;

public class PrintingMachine {
	List<Integer>l=new ArrayList<Integer>();
	//int i;
	public void produce() throws InterruptedException
	{
		int capacity=1;
		while(true) {
		synchronized (this) {
			
		
		//int i=(int) Math.random();
		while(l.size()==capacity)
		{
			System.out.println("producer thread is going into wait state");
			wait();
		}
		l.add(2);
		System.out.println(l.get(0) );
		notify();
		Thread.sleep(1000);
	}
		}
	}
    
	public void consume() throws InterruptedException
	{
		int k=0;
		while(true)
		{
		synchronized(this)
		{
		
		l.remove(k);
		System.out.println("value is removed"+k);
		
		while(l.size()==0)
		{
			System.out.println("consumer thread is going into wait state");
			wait();
		}
		notify();
		Thread.sleep(1000);
	}
		}
	}
}

	
