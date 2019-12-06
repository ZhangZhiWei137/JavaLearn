package ThreadClass;

public class Demo01 extends Thread {

	private int count = 0;
	
	public Demo01(int count) {
		super();
		this.count = count;
	}

	@Override
	public void run() {
		super.run();
		
		while(count>0) {
			System.out.println(getName() + " is running....[" + count-- + "]");
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public static void main(String[] args) {
		Demo01 demo1 = new Demo01(100);
		Demo01 demo2 = new Demo01(100);
		demo1.start();
		demo2.start();
	}

}
