package control;

public class Control4 {
    public static void main(String[] args) {
        // 1~10까지의 숫자중 찍수의 합과 평균을 구하시오
        // for
        int sum = 0;
        double avg = 0;
        int cnt = 0;
        for(int i=1; i<=10; i++){
            if(i%2==0){
                sum += i;
                cnt++;
            }
        }
        avg = (double)sum/cnt;
        System.out.printf("%d %5.2f \n", sum, avg);
    }
}
