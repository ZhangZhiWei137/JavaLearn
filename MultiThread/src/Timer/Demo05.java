package Timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 方法5：创建启动线程之Timer定时任务
 * @author fatah
 */
public class Demo05 {
	private static int count = 1;
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("定时任务延迟3,每隔1000ms执行一次,第" + count + "/10次");
				count++;
				
				if(count > 10)
					timer.cancel(); //执行10次，结束定时器
			}
		}, 3, 1000);
	}
	
}