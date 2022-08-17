package 반복문;
import java.util.Scanner;
public class main25304{
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int X=scanner.nextInt();
        int N=scanner.nextInt();
        for(int i=0; i<N; i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            X= X-(a*b);
        }
        scanner.close();
      if(X==0){System.out.printf("Yes");}
      else{System.out.printf("No");}

        //if (X의 값과 a*b의 값이 같으면) Yes 출력 , else No 출력
    }
}