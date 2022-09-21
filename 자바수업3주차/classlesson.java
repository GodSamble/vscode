/*package 자바수업3주차;

public class classlesson {
    class A{
    class B{}
class A extends B{}
class A{
    B b;

    void method (B b){
    }
    void method(){
        B b = new B();
    }

    B b = new B();
    A a = (A) new B();
    A a = b;
    //총이렇게 세가지는 사용이 불가능하다.
    class A{
        int a1= 10;
        public int a2=20;
        protected int a3=30;
        private int a4=40;
    }

    class B{
        public static void main(String[] args){
            A a = new A();
            System.out.printfln(a1);
        }
    }

}

public class ClassTest{
    void method(){
    A a = new A();
    System.out.println(a.a1+","+a.a2+","+a.a3+","+a.a4);
}
}

//The field A.a4 is not visible
//완전히 다른 클래스 (public)
//같은 패키지 내의 다른 클래스 (public/' ')
//부모-자식 관계인 클래스(public / protected)

public class Parent{
    protected int a;
    public void method1(){}
    public Parent(){
        System.out.println("Parent");
    }
    public class Child extends Parent{
        public Child(){
            Super("Hello");
            System.out.println("Child");
            
        }
    }
    class Test{
        public static void main(String[] args){
            Child c = new Child();
        }
    }
    
    //제 3의 객체 내의 메소드
    void method(){
        Parent p = new Parent(); //Child();
        Child c = new Child();     //Parent();
    p = c;
    c =(Child)p;
    }
}*/