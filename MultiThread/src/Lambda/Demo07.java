package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 使用Lambda表达式并行计算
 * parallelStream
 * @author fatah
 */
public class Demo07 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i<= 100; i++)
			list.add(i);
		Demo07 demo = new Demo07();
		int result = demo.add(list);
		System.out.println("计算后的结果为"+result);
	}
	
	public int add(List<Integer> list) {
		//若Lambda是串行执行,则应顺序打印
		list.parallelStream().forEach(System.out :: println);
		//Lambda有stream和parallelSteam(并行)
		return list.parallelStream().mapToInt(i -> i).sum();
	}
}
