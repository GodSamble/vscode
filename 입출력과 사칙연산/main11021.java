import java.util.Scanner;
public class main11021 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        for(int i=1; i<=N; i++){
            int A=scanner.nextInt();
            int B=scanner.nextInt();
            System.out.printf("Case #%d: %d%n",i,A+B);
        }
        
        scanner.close();
    }
    
}