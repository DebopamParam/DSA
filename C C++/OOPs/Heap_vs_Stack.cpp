#include <iostream>
using namespace std;

class Rectangle
{
public:
    int  length , breadth;

    Rectangle(int l =0 , int b=0 )
    {
        length = l;
        breadth = b;
    }

    int area()
    {
        return length*breadth;
    }
};



int main()
{
    Rectangle *p = new Rectangle();
    cout<<"Enter length and breadth : ";
    cin>>p->length>>p->breadth;

    cout<<"Area: "<<p->area()<<endl;
    delete (p);
    return 0;
}