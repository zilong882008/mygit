package com.cn.thread;

import java.util.concurrent.BlockingQueue;

public class GetThread extends Thread {
	
	private BlockingQueue<String> bq;//fasd
	
	public GetThread(BlockingQueue<String> bq) {
		super();
		this.bq = bq;
	}

	@Override
	public void run() {
		 for(int i=0;i<20;i++){
			 System.out.println("添加商品>>> N"+i);
			 bq.add("N"+i);
		 }
		 bq.add("end");
	}
}
