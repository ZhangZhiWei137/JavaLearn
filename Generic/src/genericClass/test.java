package genericClass;

import org.junit.jupiter.api.Test;

public class test {

	@Test
	public void testBox() {
		
	    Box<Integer> integerBox = new Box<Integer>();
	    Box<String> stringBox = new Box<String>();
	 
	    integerBox.add(new Integer(10));
	    stringBox.add(new String("菜鸟教程"));
	 
	    System.out.printf("整型值为 :%d\n\n", integerBox.get());
	    System.out.printf("字符串为 :%s\n", stringBox.get());
	    
	    Integer ret1 = integerBox.playSound(100);
	    String ret2 = stringBox.playSound("zzw");
	    System.out.println(ret1);
	    System.out.println(ret2 + "\n\n");
	    
	    integerBox.printMsg("test", "hello", "world", "!");
	    
	    Box.show("Today is sunny");
	}
}
