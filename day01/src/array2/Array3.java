package array2;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        // 5행 5열의 배열에
        // 1~100 까지의 random 한 숫자를 입력한다
        // 단, 중복되서 들어가면 안된다.
        // 최종 배열을 출력
        int arr[][] = new int[5][5];
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num = rand.nextInt(100) + 1;

                // 중복 검사
                for (int k = 0; k <= i; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (k == i && l >= j) break; // 현재 칸까지만 검사
                        if (arr[k][l] == num) {
                            num = 0; // 중복 표시
                            break;
                        }
                    }
                    if (num == 0) break; // 이미 중복이면 중지
                }

                if (num == 0) {
                    j--; // 다시 같은 위치로 돌아감
                } else {
                    arr[i][j] = num; // 중복 아니면 넣음
                }
            }
        }
//        for (int j = 0; j < 5; j++) {
//            for (int i = 0; i < 5; i++) {
//                int num = rand.nextInt(100) + 1;
//                if( j == 0 && i ==0){
//                    arr[i][j] = num;
//                }else{
//                    for(int k = 0; k < 5; k++){
//                        for(int l = 0; l < 5; l++){
//                            if(arr[i][j] == num){
//                                j--;
//                                break;
//                            }else{
//                                arr[i][j] = num;
//                            }
//                        }
//                    }
//                }
//            }
//        }
        for(int n[]: arr){
            for(int num:n){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
