package genericClass;

import java.awt.List;
import java.util.ArrayList;

// 泛型类
public class Box<T> {
	   
	  private T t;
	 
	  public void add(T t) {
	    this.t = t;
	  }
	 
	  public T get() {
	    return t;
	  }
	  
	  // 泛型方法
	  public <K> K playSound(K how) {
		
		  System.out.println("This box is playing by: " + how);
		  return how;
	  }
	  
	  // 泛型方法与可变参数
	  public <K, V> void printMsg( K prex, V... args){
		  System.out.println("prex is: " + prex);
		  ArrayList<V> ls = new ArrayList<V>();
		    for(V t : args){
		    	ls.add(t);
		    }
		    System.out.println(ls.toString());
		}
	  
	  //静态方法与泛型
	    /**
	     * 如果在类中定义使用泛型的静态方法，需要添加额外的泛型声明（将这个方法定义成泛型方法）
	     * 即使静态方法要使用泛型类中已经声明过的泛型也不可以。
	     * 如：public static void show(T t){..},此时编译器会提示错误信息：
	          "StaticGenerator cannot be refrenced from static context"
	          
	     *  必须有<T>， 且它和类的泛型<T>没有关系
	     */
	  public static <T> void show(T t) {
		  System.out.println("I'm show "+ t);
	  }

//	  
//	  无论何时，如果你能做到，你就该尽量使用泛型方法。也就是说，如果使用泛型方法将整个类泛型化，
//
//	  那么就应该使用泛型方法。另外对于一个static的方法而已，无法访问泛型类型的参数。
//
//	  所以如果static方法要使用泛型能力，就必须使其成为泛型方法。
}