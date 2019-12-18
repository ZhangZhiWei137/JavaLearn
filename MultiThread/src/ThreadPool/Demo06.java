package ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

//线程池的实现(java.util.concurrent.Executor接口)
//降低了创建线程和销毁线程时间开销和资源浪费
public class Demo06 {

	private static int count = 0;
	
	public static void main(String[] args) throws Exception {
		
		//创建带有5个线程的线程池
		//返回的实际上是ExecutorService,而ExecutorService是Executor的子接口
		
		//Executor: 运行完毕，但程序并未停止，原因是线程池并未销毁，若想销毁调用threadPool.shutdown(); 
		//ExecutorService: 
		//CachedThreadPool: 则不需要指定线程数量，线程数量多少取决于线程任务，不够用则创建线程，够用则回收。
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		for(int i = 0 ;i < 100 ; i++) {
			threadPool.execute(new Runnable() {
				public void run() {
					count++;
					System.out.println(Thread.currentThread().getName()+" is running, [count"+ count +"]");
					
				}
			});
		}

		
		Thread.sleep(8000);
		
		System.out.println("active thread in pool are: "+ ((ThreadPoolExecutor)threadPool).getActiveCount());
		System.out.println("pool size is : "+ ((ThreadPoolExecutor)threadPool).getPoolSize());
		
		threadPool.shutdown();//shutdown() 只是关闭了提交通道，用submit()是无效的；而内部该怎么跑还是怎么跑，跑完再停。
		
		System.out.println("pool is shotdown.");
		System.out.println("active thread in pool are: "+ ((ThreadPoolExecutor)threadPool).getActiveCount());
		System.out.println("pool size is : "+ ((ThreadPoolExecutor)threadPool).getPoolSize());
		
	}
}
