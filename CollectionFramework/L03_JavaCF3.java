package CollectionFramework;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class L03_JavaCF3 {
    public static void main(String[] args) {
        
        // -----Java Collection Framework-----
        // -----Bonus Module-----

        // MapInterface

        Map<String,String> mapping = new HashMap<>();
        mapping.put("us","United States");
        mapping.put("in","India");
        mapping.put("br","Brazil");
        System.out.println(mapping);

        Map<String,String> table = new HashMap<>();
        table.put("en","England");
        System.out.println("Before: "+ table);
        table.putAll(mapping);
        System.out.println("After: "+table);

        table.remove("en");
        System.out.println(table);
        
        mapping.putIfAbsent("id","indonesia");
        System.out.println(mapping);

        System.out.println(mapping.get("id"));
        
        System.out.println(mapping.getOrDefault("ind","None"));

        System.out.println(mapping.containsKey("usa"));

        System.out.println(mapping.containsValue("India"));

        mapping.replace("us","epstein");
        System.out.println(mapping);

        mapping.remove("id");
        System.out.println(mapping);

        Set<String> mapset=mapping.keySet();
        System.out.println(mapset);

        System.out.println(mapping.values());

        System.out.println(mapping.entrySet());
        
    }
}