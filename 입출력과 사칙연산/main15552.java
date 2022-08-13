import java.util.Scanner;
public class main15552 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        for(int i=0; i<N; i++){
            int A=scanner.nextInt();
            int B=scanner.nextInt();
            System.out.println(A+B);
        }
        
        scanner.close();
    }
    
}