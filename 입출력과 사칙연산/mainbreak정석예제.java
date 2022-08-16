public class mainbreak정석예제 {
    public static void main(String[] args){

    Loop1:for(int i=2; i<=9; i++){
            for(int j=1; j<=9; j++){
            
            if(j==5)
//            break Loop1;
            break;
//           continue Loop1;
//           continue;
           
            System.out.println(i+"*"+j+"="+i*j);

            }
     System.out.println();
     }   
}
    
}
//자바의정석 178p 내용이며 구간 별 상이한거 확인 차, 해보기.
//자바의정석 180p 프로그램 예제 하나 있는데 그걸 보면 '반복문/ if문/ break문, continuew문'이 적절하게 사용된 걸 볼 수 있다.