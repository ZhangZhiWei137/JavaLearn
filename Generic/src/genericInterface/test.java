package genericInterface;

import org.junit.Test;

public class test {

	@Test
	public void testInterface() {
		Generator<String> fruit1Generator = new FruitGenerator1<String>("Apple");
		System.out.println(fruit1Generator.next());
		
		Generator<String> fruit2Generator = new FruitGenerator2();
		System.out.println(fruit2Generator.next());
	}

}
