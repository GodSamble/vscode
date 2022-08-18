import java.util.Scanner;
public class main3052 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr=new int[10];
        int count =0;
        int tmp=0;

        for(int i=0; i<arr.length; i++){
            arr[i]=scanner.nextInt()%42;
        }

        for ( int i = 0; i < arr.length; i++ ) {
            tmp=0;
            
            for ( int k = i+1; k < arr.length; k++ ) {
              if ( arr[i] == arr[k] ) {
                tmp ++;
              } // tmp 중첩 수 ex 42로 나눳을때 나머지 값이 ex 13 이야. 그러면 13(중첩:3) 여기서 3을 담당하는게 tmp야.
              // tmp 모든 경우의 수 다 돌려서 안나눠지는 애들끼리 남으면 

            }
            if ( tmp == 0 ) { // tmp가 0이 되게 됨.
              count ++;       // 그러면 비로소 count 증가.
            }
          }

        System.out.println(count);
        //<해결법> 
        // scanner로 풀 시 :중첩 for문을 통해 전 수 와 같다면 tmp 증가 그 외의 최종은 count ++;
        // 인지해야하는 상식 : '중첩 for문은 10*10 가로 세로 다 겪게 돼있어 모든 경우의 수를 판별 가능하다.'

        // hashset으로 풀 시 : 이 상황의 경우 hashset 문법을 사용해도 용이하다. 블로그에서 다루기.
        // (bufferedreader 제외)
        scanner.close();
    }
    
}
