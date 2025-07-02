package control;

public class Control5 {
    public static void main(String[] args) {
        // 1~10까지의 숫자중 찍수의 합과 평균을 구하시오
        // while
        int i = 1;
        int sum = 0;
        double avg = 0.0;
        int cnt = 0;
        while(i <= 10){
            if(i%2==0){
                sum += i;
                cnt++;
            }
            i++;
        }
        avg = (double)sum/cnt;
        System.out.printf("%d %5.2f \n", sum, avg);
    }
}
