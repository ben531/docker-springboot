package com.minmax;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadTest {

	public static void main(String[] args) {
		ExecutorService es = new ThreadPoolExecutor(10, 20, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>(),
				new ThreadPoolExecutor.AbortPolicy());
		es.execute(() -> {
			for (int i = 0; i < 1000; i++) {
				System.out.println("第一个es");
			}
		});

		ExecutorService es2 = Executors.newFixedThreadPool(1);
		es2.execute(() -> {
			for (int i = 0; i < 1000; i++) {
				System.out.println("----------------------");
			}
		});
	}
}
