package com.cn.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestThread {
	public static void main(String[] args) {
		BlockingQueue<String> bq= new ArrayBlockingQueue<String>(100);
		GetThread g1 = new GetThread(bq);
		SendThread s1=new SendThread(bq,"店铺1");
		SendThread s2=new SendThread(bq,"店铺2");
		g1.start();
		s1.start();
		s2.start();
		System.out.println("bb");
		System.out.println("cc");
		System.out.println("gzl");
	}
}
