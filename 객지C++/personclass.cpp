// Source CODE 1 -> main~~.cpp 
// ~~~~.cpp << 메인함수가 들어가있음 Oval 객체를 사용하는 곳 
//#include 랜덤....이나...... #include "Oval.h"이런거 들가는 공간

#include <stdio.h> 
#include "Oval.h"
using namespace std;

class Oval{
private:
int width, height;
public:
Oval():Oval(1,1) {}
Oval(int w, int h){set(w,h);}
~Oval(){cout << "Oval 소멸: "; show();} //소멸자
getWidth(){return width;}// 너비를 반환하는 getWidth()
getHeight(){return height;}
void set(int w, int h){width = w; width = h;}
void show(){cout << "width = " << width << ", height=" << height << endl;}
// 매개변수로 받기 getwidth();
// 매개변수로 받기 getheight();
};

int main(){
Oval a,b(3,4);
a.set(10,20);
a.show();
cout << b.getWidth()<<"," << b.getHeight() << endl;
}
//Oval 소멸 : width = 3, height = 4
//Oval 소멸 : width = 10, height = 20