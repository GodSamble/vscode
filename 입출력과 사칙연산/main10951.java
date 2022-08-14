import java.util.Scanner;
public class main10951 {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        while(scanner.hasNextInt()){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            System.out.printf("%d%n",a+b);
        }
        scanner.close();
    }
}
