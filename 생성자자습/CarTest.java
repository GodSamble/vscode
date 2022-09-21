package 생성자자습;

public class CarTest {
    public static void main(String[] args){
        Car c1= new Car();
        Car c2= new Car("blue");
        Car c3= new Car("red");
        Car c4=new Car("black","maha",6);
        System.out.println(c1.color+c1.gearType+c1.door);
        System.out.println(c2.color+c2.gearType);
        System.out.println(c3.color+c3.gearType);
        System.out.println(c4.color+c4.gearType+c4.door);
        //특수제작 개념
    }
}
