#include <iostream>
using namespace std;

class rectangle
{
    public:
    float length , breadth ;
    float area ()
    {return length * breadth ;}
    float perimeter ()
    {return 2*(length+breadth);}
};


int main()
{
    rectangle r1 ,r2;
    cout<<" length r1 : ";
    cin>>r1.length;
    cout<<" breadth r1 : ";
    cin>>r1.breadth;
    cout<<" length r2 : ";
    cin>>r2.length;
    cout<<" breadth r2 : ";
    cin>>r2.breadth;
    cout<<r1.area()<<endl<<r2.area()<<endl;

    return 0;
}