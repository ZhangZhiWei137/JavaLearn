package genericMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GenericTest {

	///泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
	@Test
	public void arrayTest() {
		
		System.out.println("-------test Integer array-------");
		ArrayList<Integer> ls1 = new ArrayList<Integer>();
		ls1.ensureCapacity(10);
		System.out.println(ls1.size());
		
		ls1.add(1);
		ls1.add(2);
		ls1.add(3);
		ls1.add(4);
		ls1.trimToSize();
		System.out.println(ls1.size());
		System.out.println(ls1.toString());
		
		System.out.println("--------------");
        Integer [] ls2 = (Integer [])ls1.toArray(new Integer[ls1.size()]);
        GenericArray.reverses(ls2);
        List<Integer> ls3 = Arrays.asList(ls2);
        System.out.println(ls3.toString());
        
        /////////////////////////////////////////////////////////////
		System.out.println("-------test String array-------");
		ArrayList<String> ls4 = new ArrayList<String>();
		ls4.ensureCapacity(10);
		System.out.println(ls4.size());
		
		ls4.add("zzw");
		ls4.add("willi");
		ls4.add("sym");
		ls4.add("jack");
		ls4.trimToSize();
		System.out.println(ls4.size());
		System.out.println(ls4.toString());
		
		System.out.println("--------------");
		String [] ls5 = (String [])ls4.toArray(new String[ls4.size()]);
        GenericArray.reverses(ls5);
        List<String> ls6 = Arrays.asList(ls5);
        System.out.println(ls6.toString());
	}
}
