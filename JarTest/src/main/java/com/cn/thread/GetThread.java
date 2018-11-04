package com.cn.thread;

import java.util.concurrent.BlockingQueue;

public class GetThread extends Thread {
	
	private BlockingQueue<String> bq;//fasd  gzl分支
	
	public GetThread(BlockingQueue<String> bq) {
		super();
		this.bq = bq;
	}

	@Override
	public void run() {
		 for(int i=0;i<20;i++){
			 System.out.println("添加商品>>> N"+i);//添加注释
			 bq.add("N"+i);
			 System.out.println("122");
		 }
		 bq.add("end");
	}
}
