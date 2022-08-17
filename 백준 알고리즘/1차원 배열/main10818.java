import java.util.Scanner;
public class main10818 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int min = 1000000;
        int max = -1000000;

        int N=scanner.nextInt();
        int[] score= new int[N];

        for(int i=0; i<N; i++){
            score[i]=scanner.nextInt();
            if(max<score[i]){max=score[i];}
            if(min>score[i]){min=score[i];}
        }
        System.out.println(min + " " + max);
    }    
}
//다양한 방법을 이용해서 메모리랑 작동시간단축을 위한 시도 해볼 것!