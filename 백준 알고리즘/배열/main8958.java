import java.util.Scanner;
public class main8958 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String arr[]= new String[scanner.nextInt()]; // string[안에 숫자] 받고

        for(int i=0; i<arr.length; i++){
            arr[i]=scanner.next(); // 0~arr.legnth 까지 자리할당 및, 스캐너로 입력받게하기
        }
        scanner.close();
        

        for(int i=0; i<arr.length; i++){  // arr배열 전역에 다 걸쳐, 해당되면 코드 시행하게끔 arr.length로 구간 설정.
            int cnt =0;
            int sum = 0;
            for(int k=0; k<arr[i].length(); k++){
                if(arr[i].charAt(k)=='O'){cnt ++;}
                else{cnt=0;}
                sum+=cnt;
            }
            System.out.println(sum);
        }
    }
}
    


// 
// O면 카운트 / sum으로 점수 합계

















/*Scanner scanner = new Scanner(System.in);
//중첩for 문 돌려서 연달아 나오면 tmp+
// tmp 배열 [0]이 아닌, [1]로 시작하는.
// tmp 끼리의 합으로 더하기

int N=scanner.nextInt();
for(int i=0; i<N; i++){

}
//거시적으로 봤을 때
// for 문 case 여러개묶어놓고
// case의 for문 안에서 for ,for(for)해서 // 가점 쌓아서 // 프린트아웃 하기.

//O X 판단 어떻게 하지 ?  // 
*/