package AnonymityInnerClass;

//适用于创建启动线程次数较少的环境，书写更加简便
//具体代码实现
public class Demo03 {

	
	public static void main(String[] args) {
		
		////方式1：相当于继承了Thread类，作为子类重写run()实现
		new Thread() {
			int count = 100;
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
		}.start();
		

		//方式2:实现Runnable,Runnable作为匿名内部类
		new Thread(new Runnable() {
			int count = 100;
			String name = "Thread2";
			public void run() {
				while(count>0) {
					System.out.println(name + " is running....[" + count-- + "]");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		} ).start();

	}
}
