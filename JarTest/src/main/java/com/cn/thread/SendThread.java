package com.cn.thread;

import java.util.concurrent.BlockingQueue;

public class SendThread extends Thread {

	private BlockingQueue<String> bq;
	private String name;

	public SendThread(BlockingQueue<String> bq,String name) {
		super();
		this.bq = bq;
		this.name=name;
	}

	@Override
	public void run() {
		String num;
		try {
			while (true) {
				num = bq.take();
				if(num.equals("end")){
					break;
				}
				System.out.println(name+">>成功处理：" + num);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
