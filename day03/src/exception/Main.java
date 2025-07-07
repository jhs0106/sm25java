package exception;
//0707
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.printf("Input Number..?");
        Scanner sc = new Scanner(System.in);
        int num = 0;
        try{
            num = sc.nextInt();
        }catch(InputMismatchException e){
            System.err.println("Please enter a number.");
            return;
        }
        int a[] = null;
        try{
            a = new int[num];
        }catch(Exception e){
            System.err.println("Please enter a positive number.");
            return;
        }


//        int a[] = new int[num];
//        int num = 0.1;
        for (int i = 1; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
    }
}