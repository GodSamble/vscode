import java.util.Scanner;
public class main8958test2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[scanner.nextInt()]; // 공간을 예를들어 (3)을 받았어.
        
        for(int i=0; i<arr.length; i++){
            arr[i]=scanner.next();
        }
        scanner.close();

        for(int i=0; i<arr.length; i++){
            int sum=0;
            int cnt=0;
            for(int k=0; k<arr[i].length(); k++){ //내부 열 하나씩 돌리고 있는중 ex ) OOXOOOOXXOO 이거 하나!
                if(arr[i].charAt(k)=='O'){cnt ++;}
                else{cnt=0;}
                sum+=cnt;
            }
            System.out.println(sum);
        }
    }
    
}
