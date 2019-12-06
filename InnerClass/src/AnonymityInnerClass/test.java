package AnonymityInnerClass;

public class test {
	
    public static void main(String[] args){
    	//调用的speak()是重写后的speak方法。
        Outer.getInnerInstance("小狗汪汪汪！").speak();
    }
}
