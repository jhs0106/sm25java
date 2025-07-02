package control;

public class Control2 {
    public static void main(String[] args) {
        // 1~10까지의 합과 평균을
        // for 문을 이용하여 구하시오
        int sum = 0;
        double avg = 0.0; // 어플리케이션 같은 경우는 이런 변수를 설정하는게 좋음
        int i = 0;
        for(i=1; i<=10; i++){
            sum += i;
        }
        avg = (double)sum/(i-1);
        System.out.printf("%d %5.2f \n", sum, avg);

    }
}
