package list;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListDemo {
	@Test
	public void ListTest() {
		List<String> ls = new ArrayList<String>();
		
        List<String> fruits=new ArrayList<>();
        fruits.add("苹果");
        fruits.add("香蕉");
        fruits.add("桃子");

		
		System.out.println("List type is: "+ ls.getClass());
		System.out.println("List ClassLoader is: "+ ls.getClass().getClassLoader());
		//System.out.println("List Parent ClassLoader is: "+ ls.getClass().getClassLoader() == null ? null : ls.getClass().getClassLoader().getParent());
		System.out.println("List lenght is:" + ls.size());
		System.out.println("--------");
		////////////////////////////////////
        //for循环遍历list
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        
        System.out.println("--------");
        String appleString="苹果";
        //true or false
        System.out.println("fruits中是否包含苹果："+fruits.contains(appleString));

        if (fruits.contains(appleString)) {
            System.out.println("我喜欢吃苹果");
        }else {
            System.out.println("我不开心");
        }
        System.out.println("--------");
        fruits.remove(0);
        fruits.add(0,"apple");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        System.out.println("--------");
        fruits.remove("桃子");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        //////////////////////////////////
        
        System.out.println("--------");
        fruits.set(1, "banana");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        
        System.out.println("--------");
        System.out.println(fruits.indexOf("apple"));
        System.out.println(fruits.indexOf("banana"));
        
        
        
	}
}
