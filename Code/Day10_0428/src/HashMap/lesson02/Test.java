package HashMap.lesson02;

import HashMap.lesson01.User;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        // 存放数据 put
        map.put("user",new User(1,"jack"));
        map.put("word","hello word");
        map.put("number",200);
        map.put("number",400);
        map.put(null,null);

        // map的size
        System.out.println(map.size());

        // 通过key获取数据  相同的key值会覆盖原来的数据
        Object number = map.get("number");
        System.out.println(number);


        System.out.println("-------------");
        // 通过key值删除元素
        Object remove = map.remove(null);
        System.out.println(remove);// null

        System.out.println("--------------");
        // map的遍历：keySet
        // 获取map中所有的key 两次检索
        Set<String> set = map.keySet();
        Iterator<String> its = set.iterator();
        while (its.hasNext()){
            String key = its.next();
            System.out.println(key + "->" + map.get(key));
        }

        System.out.println("----------------");
        // 通过内部类进行遍历
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        Iterator<Map.Entry<String, Object>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Object> entry = iterator.next();
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
