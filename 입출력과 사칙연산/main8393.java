import java.util.Scanner;
public class main8393 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
        int n=scanner.nextInt();
        scanner.close();
        int num=0;
        for(int i=1; i<=n; i++){num+=i;}
        System.out.println(num);
    }
    
}