import java.util.Scanner;
public class main1110 {
    //스캐너로 값 하나 받고 (O)
    // 반복문 돌려서 (O)
    // /10 %10한 값들을 a b 로 선언하고  // "불필요"
    // 두개 더한 값을 새로운 변수에 저장하고 // "불필요한 과정. 그냥 N을 계속 반복문 내에서 값 바뀌게 하면 됨" 
    // b + 위에 새로운 변수 = 또또새로운변수 // "불필요한 과정."
    // 반복문 돌렷을 때 (O)
    // 또또새로운변수 == 처음 N 값하고 같을 때 circle이라는 변수선언 및 ++처리. // "ㄴㄴ circle++처리하다가 만일 같아질 시 빠져나오면 됨"
    // circle 변수 값 출력 (O)

    /* 느낀점 :   i)선언을 되도록 안하고도 진행할 수 있으면 '간결하게' 코드 짤 것.
                ii)만들어 놓은 선언 내에서 해결가능한지 사고할 것.
                iii)나머지 산술이 들어가는 것처럼 '경우의 수' 생각잘하기.           */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt(); // ex 26 받았어
        scanner.close();

        int circle=0;
        int memory=N; // 자리수를 a b 나누지 말고 그냥 만들어 놓은 변수와 산술기능 이용해서 해볼 것

        while(true){
            // /10 %10 산술한거 넣을 자리 : 첫자리 뭐오고 둘째자리 뭐오는지 산술해볼 것
            N=(N%10)*10+(((N/10)+(N%10))%10);
            circle ++;
            if(memory==N){break;}
        }

        System.out.printf("%d",circle);
        
    }
}
