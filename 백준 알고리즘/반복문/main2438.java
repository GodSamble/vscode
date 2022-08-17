package 반복문;
import java.util.Scanner;
public class main2438 {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        int N=scanner.nextInt();

        for(int i=1; i<=N; i++){
            for(int j=0; j<i; j++){
                System.out.printf("*");
            }
        System.out.printf("%n");

        scanner.close();
    }

    }
}

/*
 *   *
 *   **
 *   ***
 *   ****
 *   *****
 */