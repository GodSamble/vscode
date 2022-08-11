import java.util.Scanner;
public class main2525 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int C=scanner.nextInt();
        scanner.close();
        //첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
        //두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다. 
        int min = A*60+B;
        min+=C;
        int H= (min/60)%24;
        int M= min%60;
        System.out.println(H+" "+M);
        
    }
}

//'기존 주어진 값을 변환해서 수치에서 숫자를 더하여 다시 변환하는 방법'
// 혹은, '기존 각각의 A B 의 값에다가 시분으로 바꾼 C를 각각 더하는 방법이 있다.'
// 이처럼 거시적으로 문제를 바라보는 안목이 필요하다. 무작정 스타트를 끊기보다, 계획을 세우고 시행을 하는 순으로 진행되어야한다.