package array2;

import java.util.Random;

public class Array5 {
    public static void main(String[] args) {
        // 배열 선언
        int arr[][] = new int[3][3];
        Random rand = new Random();
        // 배열에 값을 입력
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                int rNum = rand.nextInt(10)+1;
                if(i==0 && j==0){
                    System.out.printf("Start %d\n",rNum);
                    arr[i][j] = rNum;
                }else{
                    boolean flag = true;
                    // rNum 이 배열에 있으면 다시 랜덤 변수 생성
                    point:
                    for(int k=0; k<=i; k++){
                        for(int n: arr[k]){
                            if(n == rNum){
                                System.out.printf("중복 : arr[%d][%d] %d\n",i, j,rNum);
                                flag = false;
                                j--;
                                break point;
                            }
                        }
                    }
                    // rNum 이 배열에 없으면 입력
                    if(flag == true){
                        System.out.printf("입력 : arr[%d][%d] %d\n",i, j,rNum);
                        arr[i][j] = rNum;
                    }
                }

            }
        }
        // 배열 출력
//        for(int a[]:arr){
//            for(int n:a){
//                System.out.print(n+" ");
//            }
//            System.out.println();
//        }
    }
}
