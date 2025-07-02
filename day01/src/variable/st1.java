package variable;

public class st1 {
    public static void main(String[] args) {
        // Reference Type ... Primitive type x
        // Reference => Class Object
        String st1 = new String("abc");
        String st2 = new String("abc");

        // 이렇게 만들 수 있는 레퍼런스 타입은 스트링 밖에 없음
        String st3 = "abc";
        String st4 = "abc";

        // 프리미티브 타입은 스택에 들어가고 레퍼런스 타입들은 힙에 들어감
        // new String 으로 생성된 st1, st2는 힙 영역에 각각 다른 주소로 생성되고 저장된다 그렇지 않은 st3와 st4는 스트링 풀에서
        // 서로 같은 내용은 생성하지 않기에 같은 주소로 저장된다. 그렇기에 st3==st4만 된다
        if(st1 == st2){
            System.out.println("OK1");
        }
        if(st1 == st3){
            System.out.println("OK2");
        }
        if(st3 == st4){
            System.out.println("OK3");
        }
        if(st1.equals(st2)){
            System.out.println("OK4");
        }
        if(st1.equals(st3)){
            System.out.println("OK5");
        }
    }
}
