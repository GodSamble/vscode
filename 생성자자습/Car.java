package 생성자자습;

class Car {
String color;
String gearType;
int door;

Car(){
    this("White","auto",4);
}//기본옵션으로 소비자가 선택할 경우
Car(String color){
    this(color,"auto",4);
}//기본옵션값 오토랑 문개수는 동일하고 컬러만 변경가능

Car(String color, String gearType,int door){
    this.color=color;
    this.gearType=gearType;
    this.door=door;
} //특수제작과도 유사함.
}