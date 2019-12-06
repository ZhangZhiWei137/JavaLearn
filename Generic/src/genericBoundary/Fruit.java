package genericBoundary;


//<? extends T>和<? super T>是Java泛型中的“通配符（Wildcards）”和“边界（Bounds）”的概念。
//<? extends T>：是指 “上界通配符（Upper Bounds Wildcards）”
//<? super T>：是指 “下界通配符（Lower Bounds Wildcards）”
public class Fruit extends Food{
	protected String color;
	protected String shape;
	public void getColor() {
		System.out.println("Fruit color is: " + color);
	};
	public void getShape() {
		System.out.println("Fruit shape is: " + shape);
	};
}