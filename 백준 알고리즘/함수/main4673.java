public class main4673 {
 
	public static void main(String[] args) { //백준 셀프넘버 문제
        

		boolean[] check = new boolean[10001];	// 1부터 10000이므로
 
		for (int i = 1; i < 10001; i++){
			int n = d(i);
		
			if(n < 10001){	// 10000 이 넘는 수는 필요가 없음
				check[n] = true;
			}
		}
        //1~10000까지 '체크' 하기.

		StringBuilder sb = new StringBuilder();
        
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) {	// false 인 인덱스만 출력
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
 
    //1~10000까지 '아닌거' '출력'해.
 
	public static int d(int number){
		int sum = number;
    
		while(number != 0){
			sum = sum + (number % 10); // 첫 째 자리수
			number = number/10;	// 10을 나누어 첫 째 자리를 없앤다
		}
    
		return sum;
	}
}    
    //int d(int number)
    //위 본문에서는 (int number)자리에, (for문의 i)가 들어갈 거임.