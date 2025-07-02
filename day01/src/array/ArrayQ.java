package array;

import java.util.Random;

public class ArrayQ {
    public static void main(String[] args) {
        //5개에 배열에 1~10까지의 숫자를 랜덤하게 입력하세요
        //단, 중복되지 않게 입력 하세요
        //전체 배열을 출력 하시오
        //배열에 최대, 최소 값을 출력 하시오
        int [] arr = new int[5];
        Random rand = new Random();

        int i = 0;
        while (i < arr.length) {
            int num = rand.nextInt(10) + 1;

            int j = 0;
            for (j = 0 ; j < i; j++) {
                if (arr[j] == num) {
                    break;
                }
            }

            if (j == i) {
                arr[i] = num;
                i++;
            }
        }

        // 배열 출력
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

        int max = arr[0];
        int min = arr[0];
        //최대 최소 구하기
        for (int m = 1; m < arr.length; m++) {
            if (arr[m] > max) max = arr[m];
            if (arr[m] < min) min = arr[m];
        }
        System.out.println("\n최대값: " + max);
        System.out.println("최소값: " + min);


    }
}
