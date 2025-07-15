package hw8;
import java.math.BigInteger;
import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // 建立 Collection 物件並加入資料
        Collection<Object> collection = new ArrayList<>();
        collection.add(100);               // Integer
        collection.add(3.14);              // Double
        collection.add(21L);               // Long
        collection.add((short) 100);       // Short
        collection.add(5.1);               // Double
        collection.add("Kitty");           // String (非 Number 類型)
        collection.add(100);               // Integer
        collection.add(new Object());      // Object (非 Number 類型)
        collection.add("Snoopy");          // String (非 Number 類型)
        collection.add(new BigInteger("1000")); // BigInteger

        // 使用 Iterator 列印所有元素
        System.out.println("使用 Iterator 列印:");
        Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 使用傳統 for 迴圈列印所有元素
        System.out.println("\n使用傳統 for 迴圈列印:");
        Object[] array = collection.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // 使用 foreach 列印所有元素
        System.out.println("\n使用 foreach 列印:");
        for (Object obj : collection) {
            System.out.println(obj);
        }

        // 移除不是 java.lang.Number 類型的物件
        collection.removeIf(item -> !(item instanceof Number));

        // 再次印出集合物件的所有元素
        System.out.println("\n移除非 Number 類型的物件後:");
        for (Object obj : collection) {
            System.out.println(obj);
        }
    }
}

