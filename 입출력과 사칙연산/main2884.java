import java.util.Scanner;
public class main2884 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
//첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
//입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
//문제는 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다
        int H=scanner.nextInt();
        int M=scanner.nextInt();
        scanner.close();

		if(M < 45) {
            H--;		// 시(hour) 1 감소
			M= 60 - (45 - M); 	// 분(min) 감소

		if(H < 0) {H = 23;}
		System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
	}
    }
