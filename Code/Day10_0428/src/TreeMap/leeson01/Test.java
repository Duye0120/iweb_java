package TreeMap.leeson01;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("A","AA");
        map.put("D","DD");
        map.put("B","BB");
        map.put("C","CC");

        System.out.println(map.size());
        System.out.println(map.get("A"));

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> its = entries.iterator();
        while (its.hasNext()){
            Map.Entry<String, String> next = its.next();
            System.out.println(next + "->" + next.getValue());
        }
    }
}
