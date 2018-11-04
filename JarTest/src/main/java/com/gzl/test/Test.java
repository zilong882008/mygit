package com.gzl.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.cn.thread.GetThread;
import com.cn.thread.SendThread;

public class Test {
	public static void main(String[] args) {
		 Integer i1=new Integer(100);
		 Integer i2=new Integer(100);
		 int i3=100;
		 Integer i4=100;
		 Integer i5=100;
		 
		 Integer i6=100;
		 Integer i7=100;
		 System.out.println(i1==i2);
		 System.out.println(i1.equals(i2));
		 System.out.println(i1==i3);
		 System.out.println(i1.equals(i3));
		 System.out.println(i1==i4);
		 System.out.println(i4==i5);
		 System.out.println(i6==i7);
			BlockingQueue<String> bq= new ArrayBlockingQueue<String>(100);

			GetThread gg = new GetThread(bq);
			System.out.println("11");
		  
	}
}
