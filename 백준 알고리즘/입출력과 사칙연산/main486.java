import java.util.Scanner;
public class main486 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int h=scanner.nextInt();
        int m=scanner.nextInt();
        int subm=scanner.nextInt();
        int a,b;

        a= subm/60;
        b= subm%60;

        scanner.close();
        
        System.out.println((h+a)+" "+(m+b));
        if(h>23){} //24가 되면 안되므로
}
}