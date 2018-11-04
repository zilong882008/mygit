package com.cn.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 线程测试类20181104  2233
 * @author 子龙
 *
 */
public class TestThread2 {
	private static  BlockingQueue<String> list= new ArrayBlockingQueue<String>(100);
	public static void main(String[] args) throws InterruptedException {
		Thread a=new Thread(){
			public void run() {
				for(int i=0;i<20;i++){
					list.add("添加"+i);
					System.out.println("添加"+i);
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
