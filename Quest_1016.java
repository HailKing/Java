import java.util.Scanner;

public class Quest_1016 {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        int distance = s1.nextInt();
        System.out.printf("%d minutos\n", distance * 2);
        s1.close(); 
    }
}