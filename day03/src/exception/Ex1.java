package exception;
//0707
import java.io.*;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        File file = null;
        file = new File("a.txt");

        Reader reader = null;
        try{
            reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while(true) {
                line = br.readLine();
                if (line == null) break;
                System.out.println(line);
            }
        } catch (Exception e){
            System.out.println("Exception"+ e.getMessage());
            return;
        }

    }
}
