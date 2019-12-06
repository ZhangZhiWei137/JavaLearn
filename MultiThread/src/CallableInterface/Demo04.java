package CallableInterface;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 方式4:实现Callable<T> 接口
 * 含返回值且可抛出异常的线程创建启动方式
 * @author fatah
 */
public class Demo04 implements Callable<String> {

	private int count = 0;
	
	public Demo04(int count) {
		this.count = count;
	}

	@Override
	public String call() throws Exception {
		while(count>0) {
			System.out.println("Thread" + " is running....[" + count-- + "]");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return "Thread return.";
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Demo04 d = new Demo04(300);
		/*	call()只是线程任务,对线程任务进行封装
			class FutureTask<V> implements RunnableFuture<V>
			interface RunnableFuture<V> extends Runnable, Future<V>
		*/
		FutureTask<String> task = new FutureTask<>(d);
		Thread t = new Thread(task);
		t.start();
		System.out.println("提前完成任务...");
		//获取任务执行后返回的结果
		String result = task.get();
		System.out.println("线程执行结果为"+result);
	}
}
