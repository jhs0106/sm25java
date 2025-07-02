package operatiion;

public class op4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        // 3수의 최대 값과 최소 값을 구하시오.
        // if
        int min = 0;
        int max = 0;

        max = (a > b) ? ((a > c) ? a : c ) : ((b>c) ? b : c);
        min = (a<b) ? ((a<c)?a:c) : ((b>c) ? b : c);
        System.out.printf("%d %d\n",min,max);

        if(a>b && a>c){
            System.out.println(a);
        } else if (b>c) {
            System.out.println(b);
        } else{
            System.out.println(c);
        }

        if(a<b && a<c){
            System.out.println(a);
        } else if (b<c) {
            System.out.println(b);
        } else{
            System.out.println(c);
        }


    }
}
