package Spring;

//Spring实现多线程
//1、新建Maven工程导入spring相关依赖
//2、新建一个java配置类(注意需要开启@EnableAsync注解——支持异步任务)
//3、书写异步执行的方法类(注意方法上需要有@Async——异步方法调用)
//4、创建运行类

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
 
@Service
public class AsyncService {
	
	@Async
	public void Async_A() {
		System.out.println("Async_A is running");
	}
	
	@Async
	public void Async_B() {
		System.out.println("Async_B is running");
	}
}
