package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class MapDemo {

	@Test
	public void testMap() {
		//创建Map对象
        Map<String, String> map = new HashMap<String,String>();       //数据采用的哈希表结构
        //给map中添加元素
        map.put("星期一", "Monday");
        map.put("星期日", "Sunday");
        System.out.println(map); // {星期日=Sunday, 星期一=Monday}
        System.out.println("==================");
        
        //当给Map中添加元素，会返回key对应的原来的value值，若key没有对应的值，返回null
        System.out.println(map.put("星期一", "Mon")); // Monday
        System.out.println(map); // {星期日=Sunday, 星期一=Mon}
        System.out.println("==================");
        
        //根据指定的key获取对应的value
        String en = map.get("星期日");
        System.out.println(en); // Sunday
        System.out.println("==================");
        
        //根据key删除元素,会返回key对应的value值
        String value = map.remove("星期日");
        System.out.println(value); // Sunday
        System.out.println(map); // {星期一=Mon}
        System.out.println("==================");
        
	}
	
	
	//Map集合遍历键找值方式
	//利用了迭代器Iterator
	@Test
	public void testIterator() {
		
		//遍历方法1：keyset遍历
        //创建Map对象
        Map<String, String> map = new HashMap<String,String>();
        //给map中添加元素
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "柳岩");
        //获取Map中的所有key
        Set<String> keySet = map.keySet();
        //遍历存放所有key的Set集合
        Iterator<String> it =keySet.iterator();
        while(it.hasNext()){                         //利用了Iterator迭代器**
            //得到每一个key
            String key = it.next();
            //通过key获取对应的value
            String value = map.get(key);
            System.out.println(key+"="+value);
        }

        System.out.println("==================");

        //遍历方法2：
        //创建Map对象
        Map<String, String> map2 = new HashMap<String,String>();
        //给map中添加元素
        map2.put("邓超", "孙俪");
        map2.put("李晨", "范冰冰");
        map2.put("刘德华", "柳岩");
        //获取Map中的所有key与value的对应关系
        Set<Map.Entry<String,String>> entrySet = map2.entrySet();
        //遍历Set集合
        Iterator<Map.Entry<String,String>> it2 =entrySet.iterator();
        while(it2.hasNext()){
            //得到每一对对应关系
            Map.Entry<String,String> entry = it2.next();
            //通过每一对对应关系获取对应的key
            String key = entry.getKey();
            //通过每一对对应关系获取对应的value
            String value = entry.getValue();
            System.out.println(key+"="+value);

        }
	}
}
