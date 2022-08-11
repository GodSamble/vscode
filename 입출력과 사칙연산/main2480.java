import java.util.Scanner;
public class main2480 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();
        //같은 눈 세개 
        if(n1==n2&&n2==n3&&n3==n1){System.out.println(10000+n1*1000);}
        //같은 눈 두개
        else if(n1==n2||n1==n3){System.out.println(1000+n1*100);}
        else if(n2==n3){System.out.println(1000+n2*100);}
        //모두 다른 경우
        else{System.out.println((Math.max(n1, Math.max(n2, n3))*100));}

//Q같은눈 : > else if ||혹은 문법은 '세 개' 있을 때 '두 개'로 찢음
//Q가장큰눈 : Math.max() 문법 사용 or 'max'라는 최대값을 뜻하는 변수를 선언하고 젤 높은값 if문으로 다 기술함.
    }
}

