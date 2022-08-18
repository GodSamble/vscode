public class main199p {
    public static void main(String[] args){
        // [로또 번호 추첨기 코드임 !]
        int[] ball = new int[45];
        for(int i=0; i<ball.length; i++){
            ball[i]=i+1; // ball[0]= 1 .....
        }
        int j=0;
        int temp=0; // 두 가지의 병을 만들어 놓고

        for(int i=0; i<6; i++){
            j=(int)(Math.random() * 45);
            temp=ball[i]; // 정상적으로 temp에 배열 순으로 넣어놓고 
            ball[i]=ball[j]; // 랜덤값을 무작위로 위에 설정해놓은 배열 칸에 딱 딱 넣는거임
            ball[j]= temp; // EX) i : 6번째 로또 추첨 // j = 23이란 숫자가 나왔어 // temp 23 부재칸을 0이 메꾸는 것임 

            // 결과적으로, Circle 써클이 랜덤박스 중복없이 잘돌아감!
        }
        for(int i=0; i<6; i++){
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
        }
    }
    
}
