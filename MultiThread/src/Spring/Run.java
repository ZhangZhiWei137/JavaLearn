package Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {
	public static void main(String[] args) {
		//构造方法传递Java配置类Config.class
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		AsyncService bean = ac.getBean(AsyncService.class);
		bean.Async_A();
		bean.Async_B();
	}
}
