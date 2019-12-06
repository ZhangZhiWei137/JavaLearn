package RunnableInterface;

public class Demo02 implements Runnable {
	
	private int count = 0;
	private String name;
	
	public Demo02(int count, String name) {
		this.count = count;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//重写的是Runnable接口的run()
	@Override
	public void run() {
		while(count>0) {
			System.out.println(getName() + " is running....[" + count-- + "]");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Demo02(100, "thread1"));
		Thread thread2 = new Thread(new Demo02(100, "thread2"));
		thread1.start();
		thread2.start();
	}

}
