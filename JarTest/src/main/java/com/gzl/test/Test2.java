package com.gzl.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class Test2 {
	private static  BlockingQueue<String> list= new ArrayBlockingQueue<String>(100);
	public static void main(String[] args) throws InterruptedException {
		Thread a=new Thread(){
			public void run() {
				for(int i=0;i<20;i++){
					list.add("添加"+i);
					System.out.println("添加"+i);
					System.out.println("添加成功");//110423
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		};
		
		
		Thread b=new Thread(){
			public void run() {
				for(int i=0;i<20;i++){
					try {
						String num =list.take();
						System.out.println("消费"+num);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					 
				}
			};
		};
		a.start();
		b.start();
		a.join();
		b.join();
		System.out.println("结束");
	 }
}
