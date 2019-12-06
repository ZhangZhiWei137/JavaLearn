package AnonymityInnerClass;
/**
*	外部类、匿名内部类
*/
public class Outer {

    public static IAnimal getInnerInstance(String speak){
        return new IAnimal(){
            @Override
            public void speak(){
                System.out.println(speak);
            }};
        	//注意上一行的分号必须有
    }
  
}
