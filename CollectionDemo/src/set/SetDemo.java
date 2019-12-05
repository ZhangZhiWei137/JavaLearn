package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class SetDemo {
	  @Test
	 public void AllSetSummary() {
		 
	        HashSet<String> hashSet = new HashSet<>();
	        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
	        TreeSet<String> treeSet = new TreeSet<>();

	        for (String data : Arrays.asList("B", "E", "D", "C", "A")) {
	            hashSet.add(data);
	            linkedHashSet.add(data);
	            treeSet.add(data);
	        }

	        //不保证有序
	        System.out.println("Ordering in HashSet :" + hashSet);

	        //FIFO保证安装插入顺序排序
	        System.out.println("Order of element in LinkedHashSet :" + linkedHashSet);

	        //内部实现排序
	        System.out.println("Order of objects in TreeSet :" + treeSet);

	 }
	  
//	  排序的引入(以基本数据类型的排序为例)
//	  由于TreeSet可以实现对元素按照某种规则进行排序，例如下面的例子
	  @Test
	  public void TreeSetBaseType() {

		        // 创建集合对象
		        // 自然顺序进行排序
		        TreeSet<Integer> ts = new TreeSet<Integer>();

		        // 创建元素并添加
		        // 20,18,23,22,17,24,19,18,24
		        ts.add(20);
		        ts.add(18);
		        ts.add(23);
		        ts.add(22);
		        ts.add(17);
		        ts.add(24);
		        ts.add(19);
		        ts.add(18);
		        ts.add(24);

		        // 遍历
		        for (Integer i : ts) {
		            System.out.println(i);
		        }
		}

//	  如果是引用数据类型呢,比如自定义对象,又该如何排序呢?
	  
//	  由于不知道该安照那一中排序方式排序，所以会报错。
//	  解决方法：
//	  1.自然排序
//	  2.比较器排序
//	  @Test
//	  public void TreeSetObjectType() {
//
//		        TreeSet<Student> ts=new TreeSet<Student>();
//		        //创建元素对象
//		        Student s1=new Student("zhangsan",20);
//		        Student s2=new Student("lis",22);
//		        Student s3=new Student("wangwu",24);
//		        Student s4=new Student("chenliu",26);
//		        Student s5=new Student("zhangsan",22);
//		        Student s6=new Student("qianqi",24);
//
//		        //将元素对象添加到集合对象中
//		        ts.add(s1);
//		        ts.add(s2);
//		        ts.add(s3);
//		        ts.add(s4);
//		        ts.add(s5);
//		        ts.add(s6);
//
//		        //遍历
//		        for(Student s:ts){
//		            System.out.println(s.getName()+"-----------"+s.getAge());
//		        }
//		}

//	  自然排序
//	  自然排序要进行一下操作：
//	  1.Student类中实现 Comparable接口
//	  2.重写Comparable接口中的Compareto方法
	  @Test
	  public void TreeSetObjectTypeEx1() {

		        TreeSet<StudentEx1> ts=new TreeSet<StudentEx1>();
		        //创建元素对象
		        StudentEx1 s1=new StudentEx1("zhangsan",20);
		        StudentEx1 s2=new StudentEx1("lis",22);
		        StudentEx1 s3=new StudentEx1("wangwu",24);
		        StudentEx1 s4=new StudentEx1("chenliu",26);
		        StudentEx1 s5=new StudentEx1("zhangsan",22);
		        StudentEx1 s6=new StudentEx1("qianqi",24);

		        //将元素对象添加到集合对象中
		        ts.add(s1);
		        ts.add(s2);
		        ts.add(s3);
		        ts.add(s4);
		        ts.add(s5);
		        ts.add(s6);

		        //遍历
		        for(StudentEx1 s:ts){
		            System.out.println(s.getName()+"-----------"+s.getAge());
		        }
  
	}

//	  (2).比较器排序
//	  比较器排序步骤：
//	  1.单独创建一个比较类，这里以MyComparator为例，并且要让其继承Comparator接口
//	  2.重写Comparator接口中的Compare方法:
//	  	compare(T o1,T o2)      比较用来排序的两个参数。
//	  3.在主类中使用下面的 构造方法:
//		  TreeSet(Comparator<? superE> comparator)
//	              构造一个新的空 TreeSet，它根据指定比较器进行排序
	  
	  @Test
	  public void TreeSetObjectTypeEx2() {
		      //创建集合对象
		      //TreeSet(Comparator<? super E> comparator) 构造一个新的空 TreeSet，它根据指定比较器进行排序。
		      TreeSet<Student> ts=new TreeSet<Student>(new ComparatorStudent());
		
		      //创建元素对象
		      Student s1=new Student("zhangsan",20);
		      Student s2=new Student("lis",22);
		      Student s3=new Student("wangwu",24);
		      Student s4=new Student("chenliu",26);
		      Student s5=new Student("zhangsan",22);
		      Student s6=new Student("qianqi",24);
		
		      //将元素对象添加到集合对象中
		      ts.add(s1);
		      ts.add(s2);
		      ts.add(s3);
		      ts.add(s4);
		      ts.add(s5);
		      ts.add(s6);
		
		      //遍历
		      for(Student s:ts){
		          System.out.println(s.getName()+"-----------"+s.getAge());
		      }
  }

}