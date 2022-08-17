import java.util.Scanner;
public class main2562 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] arr=new int[9];
        int max=0;
        int count=0;
        for(int i=0; i<9; i++){
            
            int input= scanner.nextInt();
            arr[i]=input;
        }

        for(int i=0; i<9; i++) {
			if(arr[i]>max) {
				max = arr[i];
				count = i+1;
			}
    }
    System.out.println(max);
    System.out.println(count);
}
}