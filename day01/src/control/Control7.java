package control;

import java.util.Random;
import java.util.Scanner;

public class Control7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter Command: ");
            String cmd = sc.nextLine();
            if(cmd.equals("q")){
                System.out.println("Quit...");
                break;
            }else if(cmd.equals("arr1")){
                // 1~10까지의 숫자를 입력 받는다.
                System.out.println("Enter Number(1~10):");
                String num1 = sc.nextLine();
                System.out.println("Enter Number(1~10):");
                String num2 = sc.nextLine();
                System.out.printf("Input Number : %s %s\n", num1, num2);
                System.out.printf("Plus: %s \n", num1 + num2);
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                System.out.printf("Add: %d \n", n1 + n2);
            }else if(cmd.equals("arr2")){
                // 한개의 1~10까지의 숫자를 입력 받는다.
                System.out.println("Enter Number(1~10): ");
                String num3 = sc.nextLine();
                // 해당 사이즈의 1차원 배열을 생성한다.
                int n3 = Integer.parseInt(num3);
                int arr[] = new int[n3];
                // 배열에 랜덤하게 1~10까지의 값을 입력한다. 중복되지 않게 입력
                Random rand = new Random();
                for (int i=0;i<arr.length;i++){
                    int rNum = rand.nextInt(10)+1;
                    if(i == 0){
                        arr[i] = rNum;
                    }else{
                        boolean flag = true;
                        p:
                        for(int j=0;j<arr.length;j++){
                            if(arr[j]==rNum){
                                flag = false;
//                                System.out.printf("중복값 : %d\n",arr[i]);
                                i--;
                                break p;
                            }
                        }if(flag==true){
                            arr[i] = rNum;
//                            System.out.printf("입력값 : %d\n",arr[i]);
                        }
                    }
                }
                // 1. 배열 값을 출력
                int sum = 0;
                double avg = 0.0;
                int max = arr[0];
                int min = arr[0];
                for(int k=0; k<arr.length; k++){
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                    if(arr[k]>max){max = arr[k];}
                    if(arr[k]<min){min = arr[k];}
                }
                System.out.println();
                // 2. 배열값의 합과 평균을 출력
                avg = (double)sum/arr.length;
                System.out.printf("Sum : %d \n", sum);
                System.out.printf("Avg : %.2f \n", avg);

                // 3. 최대, 최소 값 출력
                System.out.printf("Max : %d \n", max);
                System.out.printf("Min : %d \n", min);
            }else if(cmd.equals("arr3")){
                // 두 개의 1~5까지의 숫자를 입력 받는다.
                System.out.println("Enter Number(1~5):");
                String num4 = sc.nextLine();
                int n4 = Integer.parseInt(num4);
                System.out.println("Enter Number(1~5):");
                String num5 = sc.nextLine();
                int n5 = Integer.parseInt(num5);
                // 해당 사이즈의 2차원 배열을 생성한다.
                int arr2[][] = new int[n4][n5];
                // 배열에 랜덤하게 1~50까지의 값을 입력한다. 중복되지 않게 입력
                Random rand = new Random();
                for(int i=0;i< arr2.length;i++){
                    for(int j=0; j< arr2.length; j++){
                        int rNum2 = rand.nextInt(50)+1;
                        if(i==0 && j==0){
                            arr2[i][j] = rNum2;
                        }else{
                            boolean flag2 = true;
                            point:
                            for(int k=0;k<arr2.length;k++){
                                for(int l : arr2[k]){
                                    if(l==rNum2){
                                        flag2 = false;
                                        j--;
                                        break point;
                                    }
                                }
                            }
                            if(flag2==true){
                                arr2[i][j] = rNum2;
                            }
                        }
                    }
                }
                // 1. 배열 값을 출력
                int sum = 0;
                double avg = 0.0;
                int max = arr2[0][0];
                int min = arr2[0][0];
                for(int[] a : arr2){
                    for(int b : a){
                        System.out.print(b+" ");
                        sum += b;
                        if (b>max){max = b;}
                        if (b<min){min = b;}
                    }
                    System.out.println();
                }
                // 2. 배열값의 합과 평균을 출력
                avg = (double)sum/(n4*n5);
                System.out.printf("Sum : %d \n", sum);
                System.out.printf("Avg : %.2f \n", avg);
                // 3. 최대, 최소 값 출력
                System.out.printf("Max : %d \n", max);
                System.out.printf("Min : %d \n", min);
            } else{
                System.out.println("Invalid Command...");
            }
        }
        sc.close();
    }
}
