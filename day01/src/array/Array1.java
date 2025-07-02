package array;

import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        // Reference Type...
        int [] arr1 = new int[5];
        int arr2 [] = new int[5];
        int [] arr3 = {1,2,3,4,5};

        Random rand = new Random();

        for(int j=0;j<5;j++){
            arr1[j] = rand.nextInt(10)+1; //0~9
            // 랜덤 값을 집어넣되 중복되지 않는 값을 집어넣어라
        }
        for(int j=0;j<5;j++){
            System.out.print(arr1[j]+" ");
        }
        for(int n:arr1){
            System.out.print(n+" ");
        }

    }
}
