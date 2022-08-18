import java.util.Scanner;
public class main1546 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        float[] score= new float[N]; // score[0]~score[N]
        float max=0;
        float change_score_sum=0;

        for(int i=0; i<score.length; i++){
            score[i]= scanner.nextInt(); // 위의 값들 일일이 지정
            if(score[i]>max){max=score[i];} // max도 값을 찾아냄
        }

        for(int k=0; k<score.length; k++){
            change_score_sum+=(score[k]/max*100/N);
        }
        System.out.println(change_score_sum);

        
        scanner.close();
    }
}
// 모든 스캐너 N개만큼 받아,
// 그 중에서 최댓값 찾아
// 최댓값으로 모든 N나누고 원하는 방향대로 다 사칙연산 해
// 평균 구하기 += 총점 / N 하면 평균 구할 수 있음.