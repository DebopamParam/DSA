#include <iostream>
using namespace std;

class Rectangle
{
public:
    int l , b ;
    int area()
    {
        return l*b;
    }
};


int main()
{
    Rectangle r;
    Rectangle *p;
    p=&r;

    cout<<"Enter length & Breadth : "<<endl;
    cin>> p->l >> p->b ;

    cout<< p->area() <<endl;
    return 0;
}