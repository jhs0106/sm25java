package collection;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {
        // List, Set, Map
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("a");
        list.remove("a");
        //System.out.println(list);
        for(String str:list){
            System.out.println(str);
        }
        List<Integer> list1 = new ArrayList();//프리미티브 타입은 사용 X, 레퍼런스 타입이어야 함
        list1.add(1);
        list1.add(2);
        list1.add(3);

        for(Integer i:list1){
            System.out.println(i);
        }
    }
}
