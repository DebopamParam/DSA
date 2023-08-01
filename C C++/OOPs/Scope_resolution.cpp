#include <iostream>
using namespace std;

class Rectangle
{
    private:
        int length , breadth ;
    public:
        Rectangle(int l = 0 , int b =0 )
        {
            length = l;
            breadth = b;
        }
        Rectangle(Rectangle const &r)
        {
            length=r.length;
            breadth=r.breadth;
        }
        void setLB();
        int getL();
        int getB();
        int area() ;
        int perimeter() ;
        bool isSquare() ;
        ~Rectangle() ;

};

void Rectangle::setLB()
{
    int L , B;
jump:
    cout<<"Enter Length : ";
    cin>>L;
    cout<<"Enter Breadth : ";
    cin>>B;
    if (L>0 && B>0)
    {
        length=L;
        breadth=B;
    }
    else
    {
        cout<<"\n\nLength & Breadth cannot be negative\nPlease enter again\n\n"<<endl;
        goto jump;
    }
       
}

int Rectangle:: getL()
{
    return length;
}

int Rectangle:: getB()
{
    return breadth;
}

int Rectangle::area()
{
    return length*breadth;
}

int Rectangle::perimeter()
{
    return 2*(length+breadth);
}

bool Rectangle::isSquare()
{
    if(breadth==length)
    return true;
    else
    return false;
}

int main()
{
    Rectangle r(10,5);
    cout<<"Area: "<<r.area()<<endl;
    cout<<"perimeter: "<<r.perimeter()<<endl;
    if (r.isSquare())
    {
        cout<<"It is a square"<<endl;
    }
    else
    {
        cout<<"It is not a square"<<endl;
    }

    cout<<"\n\nNew entry\n\n"<<endl;

    r.setLB();

    cout<<"Area: "<<r.area()<<endl;
    cout<<"perimeter: "<<r.perimeter()<<endl;
    if (r.isSquare())
    {
        cout<<"It is a square"<<endl;
    }
    else
    {
        cout<<"It is not a square"<<endl;
    }

    
    return 0;
}