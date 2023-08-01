#include <iostream>
using namespace std;

class Rectangle
{
private:
    int length , breadth;
public:
    Rectangle(int l , int b);
    ~Rectangle();
    void setLength(int l) { length = l; }
    int getLength(){ return length ;}
    void setBreadth(int b) { breadth = b; }
    int getBreadth(){ return breadth ;}

    int area();
    bool isSquare();
};

class Cuboid:public Rectangle
{
private:
    int height;
public:
    Cuboid(int l , int b ,int h):Rectangle(l,b)
    { height = h; }
    ~Cuboid();

    void setHeight(int h) { height = h; };
    int getHeight(){ return height;}

    int volume();
};




int main()
{
    Rectangle r(2,5);
    cout<<r.area()<<endl;
    Cuboid c(5,5,5);
    cout<<c.volume()<<endl;
    return 0;
}



bool Rectangle::isSquare()
{
    if(length == breadth)
    {
        return true;
    }
    else
    {
        return false;
    }
    
}

int Rectangle::area()
{
    return length*breadth;
}

Rectangle::Rectangle(int l =0, int b=0)
{
    length = l;
    breadth = b;
}

Rectangle::~Rectangle()
{
}



int Cuboid::volume()
{
    return (getLength()*getBreadth()*getHeight());
}

Cuboid::~Cuboid()
{
    
}
