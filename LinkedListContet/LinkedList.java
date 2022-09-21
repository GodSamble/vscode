/*public class LinkedList {
    //<Linked List 개념> 
//첫번째 노드: Head 라고 불리움. 생성자
//제일 마지막 노드 찾기
//삽입
//전체 노드 출력하기

        Data head;
        public LinkedList(){head = null;}

        //제일 마지막 노드 찾기
        Data findLastNode(){
            if(head == null) return null;
            Data d = head;
            while(d.next!=null){
            d=d.next;
            }
        return d;
        }
//삽입
    void insert(String n, int p){
        Data d = findLastNode();
            if(d==null)
            head = new Data(n,p);
            else d.next =new Data(n,p);
    }

//전체 노드 출력하기
    void printAllNodes(){
    Data d= head;
    if(d==null)System.out.println("No Nodes");
    else{
        do{
            System.out.println("(" + d.name + "," +d.point+")");
        }while(d!=null);
    }
    }




// 전체적인 모양 ㅁ ㅁ ㅁ (ㅁ) 마지막 네모에 끝에 널을 배치한후에 n과 p를 넣는다
// 그 후에 괄호 네모 바로 앞에 꺼를 d라고 명명한다.

}*/ 

public class LinkedList {
    Data head ; 
    public LinkedList() {
       head = null ; 
    }
    // 제일 마지막 노드 찾기
    Data findLastNode() {
           if (head == null) return null ; 
           Data d = head ; 
           while (d.next != null) {
              d = d.next ; 
           } 
           return d ; 
        }   
    // 삽입
    void insert (String n, int p) {
       Data d = findLastNode() ; 
       if (d == null) 
           head = new Data(n, p) ;  
        else d.next = new Data(n, p) ; 
    }   
    
 // 전체 노드 출력하기 
    void printAllNodes ( ) {
       Data d = head ; 
       if (d == null) System.out.println("No Nodes ") ; 
       else {
          do {
             System.out.println("(" + d.name + ", " + d.point + ")") ;
             d = d.next ; 
           } while (d != null) ; 
        }
     }
     
 }
 //public private 'protected: 상속이랑 연관있음'