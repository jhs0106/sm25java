package array;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args){
        String [] str = new String[3];
        str[0] = "A";
        str[1] = "B";
        str[2] = "C";
        System.out.println(Arrays.toString(str));
        StringBuffer sb = new StringBuffer();
        for(String s: str){
            sb.append(s);
        }
        System.out.println(sb);
    }
}
