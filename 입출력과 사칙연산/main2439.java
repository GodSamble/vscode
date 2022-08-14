import java.util.Scanner;
public class main2439 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();

        scanner.close();

        for(int i=1; i<=N; i++){ // 행은(=엔터는) 거시적인 묶음이 필요함.
             for(int j=1; j<=N-i; j++){System.out.printf(" ");} // 이 문제의 열 우선순위인 "띄어쓰기"
            //N-i 중요함. 입력값을 받는 함수 N과 i와 연관성을 찾아야 절댓값이 아닌 움직이는 수가 표현이 가능해짐.
            
             for(int k=1; k<=i; k++){System.out.printf("*");} // 이 문제의 열 후순위인 "별"


            System.out.printf("%n");
        }
    }
}