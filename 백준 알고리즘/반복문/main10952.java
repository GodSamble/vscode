package 반복문;
import java.util.Scanner;
public class main10952 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //반복문 중에서도 while문 (스캐너 안에다가 넣어야 함) 사용해서, 0 0 참이 아닌 동안 시행
        
        
        while(true){
            int A=scanner.nextInt();
            int B=scanner.nextInt();
            if(A==0&&B==0){
                scanner.close(); // scanner.close() 위치 유의할 것. '작성해야하는 이유는 깃허브 블로그에 기재 예정'
                break;
            }
            else{System.out.printf("%d%n",A+B);}
           
    }
    }
}
