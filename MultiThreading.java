package snippet;

import java.lang.*; 

// MyThread extending Thread 
class MyThread extends Thread //implements Runnable 
{ 
	public void run() 
	{ 
		for (int i=0; i<5 ; i++) 
			System.out.println(Thread.currentThread().getName() 
								+ " in control1"); 
	} 
} 

// Driver Class 
public class MultiThreading 
{ 
	public static void main(String[]args) 
	{ 
		MyThread t = new MyThread();
		//Thread t=new Thread(t1, "Thread-Dish");
		t.start(); 

		for (int i=0; i<5; i++) 
		{ 
			// Control passes to child thread 
			Thread.yield(); 

			// After execution of child Thread 
			// main thread takes over 
			System.out.println(Thread.currentThread().getName() 
								+ " in control"); 
		} 
	} 
} 
