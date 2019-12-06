package genericBoundary;

import org.junit.Test;

public class test {

	@Test
	public void testBoundary() {
		
		// 就算容器里装的东西之间有继承关系，但容器之间是没有继承关系的
		//Fruit fruit1 = new Apple();   //<=====OK
//		Plate<Fruit> plate = new Plate<Apple>(new Apple());//<=====NOT OK
		
		//上界通配符
//		边界让Java不同泛型之间的转换更容易了。但不要忘记，这样的转换也有一定的副作用。那就是容器的部分功能可能失效。
//
//		还是以刚才的Plate为例。我们可以对盘子做两件事，往盘子里set()新东西，以及从盘子里get()东西。
		Plate<? extends Fruit> plate1 = new Plate<Apple>(new Apple());
		//不能存入任何元素
//		p.set(new Fruit());    //Error
//		p.set(new Apple());    //Error

		//读取出来的东西只能存放在Fruit或它的基类里。
		Fruit newFruit11=plate1.get();
		Object newFruit12=plate1.get();
//		原因是编译器只知道容器内是Fruit或者它的派生类，但具体是什么类型不知道。可能是Fruit？可能是Apple？也可能是Banana
//		Apple newFruit3=plate1.get();    //Error
		
		
		//下界通配符
//		下界<? super T>不影响往里存，但往外取只能放在Object对象里
		Plate<? super Fruit> plate2=new Plate<Fruit>(new Fruit());
		//存入元素正常
		plate2.set(new Fruit());
		plate2.set(new Apple());

		//读取出来的东西只能存放在Object类里。
//		Apple newFruit21=plate2.get();    //Error
//		Fruit newFruit22=plate2.get();    //Error
		Object newFruit23=plate2.get();
	} 
}
