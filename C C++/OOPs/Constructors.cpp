#include <iostream>
using namespace std;

class Rectangle
{
private:
    int length , breadth;
public:


    Rectangle(int l =0 , int b =0)
    {
        setLB(l,b);
    }

    Rectangle(Rectangle const &rect) //Const is not necessary
    {                                //it is just to show the Parameter's value is constant
        length=rect.length;
        breadth=rect.breadth;
    }
   
   
    void setLB(int L , int B)
    {
      
        if (L>=0 && B>=0)
        {
            length=L;
            breadth=B;
        }
        else
        {
            cout<<"The length & breadth cannot be negetive"<<endl;
            exit;
        }
    }

    int getLength()
    {
        return length;
    }

    int getBreadth()
    {
        return breadth;
    }

    int area()
    {
        return length*breadth;
    }    
};




int main()
{
    Rectangle r;
    Rectangle r1(10,5);
    Rectangle r2(r1);

    cout<<r.getLength()<<" "<<r.getBreadth()<<endl;
    cout<<r1.getLength()<<" "<<r1.getBreadth()<<endl;
    cout<<r2.getLength()<<" "<<r2.getBreadth()<<endl;
    return 0;
}