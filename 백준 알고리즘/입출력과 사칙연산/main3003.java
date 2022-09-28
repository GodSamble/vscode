
import java.util.Scanner;
public class main3003 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a[]={1,1,2,2,2,8};
        int b[]=new int[6];
        for(int i=0; i<b.length; i++){
            b[i]=scanner.nextInt();
            System.out.println(a[i]-b[i]+" ");
        }

        scanner.close();
    }
    
}
