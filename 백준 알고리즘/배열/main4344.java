import java.util.Scanner;
public class main4344 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int C=scanner.nextInt();

        for(int i=0; i<C; i++){  
            int n=scanner.nextInt(); 
            int arr[]=new int[n]; 

            double sum=0;
            for(int j=0; j<n; j++){
                int val=scanner.nextInt(); 
                 arr[j]=val;
                 sum+=val;
            }

            double res=sum/n;
            double cnt=0;

            for(int j=0; j<n; j++){
                if(arr[j]>res){cnt++;}
            }
            System.out.printf("%.3f%%\n",(cnt/n)*100);
        }
    }
}
// 중첩 for문과 배열을 정리하며 다루는데, 이 문제 여러번 풀어보면 좋을 듯 함.
// 필요한 변수 그때 그때 for 문 바로 위에 배치시켜서 보기 편하게 한 것이 인상적임.