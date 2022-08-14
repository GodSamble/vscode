//스캐너로 두개 받고
//반복문 + 스캐너로 값 또 받고
//if문을 사용해서 %d,두번째 스캐너 값 조건에 부합하면 출력하게끔.

import java.util.Scanner;
public class main10871{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int N=scanner.nextInt();
	int X=scanner.nextInt();
	
		for(int i=1; i<=N; i++){
			int k=scanner.nextInt();
			if(k<X){System.out.printf("%d ",k);}
		}
	
	
	scanner.close();

}
}