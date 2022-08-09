import java.util.Scanner;
public class main2588{
	public static void main(String[] args){
	Scanner scanner= new Scanner(System.in);
	int a=scanner.nextInt();
	int b=scanner.nextInt();
    scanner.close();

    System.out.println(a*(b%10));
    System.out.println(a * ((b % 100) / 10));
    System.out.println(a * (b / 100));
    System.out.println(a * b); 
	}
}