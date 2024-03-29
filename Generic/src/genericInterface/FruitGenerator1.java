package genericInterface;

/**
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
 * 即：class FruitGenerator<T> implements Generator<T>{
 * 如果不声明泛型，如：class FruitGenerator implements Generator<T>，编译器会报错："Unknown class"
 */
public class FruitGenerator1<T> implements Generator<T> {

	public T type;
	FruitGenerator1(T type){
		this.type = type;
	}
	@Override
	public T next() {
		System.out.println("FruitGenerator1 next");
		return type;
	}


}