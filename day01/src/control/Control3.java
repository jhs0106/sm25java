package control;

public class Control3 {
    public static void main(String[] args) {
        // 1~10까지 합과 평균을 구하시오
        // while
        int i = 1;
        double avg = 0.0;
        int sum = 0;
        while(i <= 10){
            sum += i;
            i++;
        }
        avg = (double)sum/(i-1);
        System.out.printf("%d %5.2f \n", sum, avg);
    }
}
