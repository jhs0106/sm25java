package collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
//0707
public class Collection2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("1");
        set.add("b");
        set.add("b");

        for(String s : set){
            System.out.println(s);
        }

        // Set을 이용하여 (1~10)까지의 6개의 숫자를 Set에 입력하고 출력하시오.
        Set<Integer> set1 = new HashSet<>();
        Random random = new Random();
        int cnt = 0;
        while(set1.size() < 6){
            cnt++;
            set1.add(random.nextInt(10)+1);
        }
        System.out.printf("Count: %d \n", cnt);
        for(Integer i : set1){
            System.out.println(i);
        }
    }
}
