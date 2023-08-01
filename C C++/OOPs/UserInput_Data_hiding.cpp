#include <iostream>
using namespace std;

class Rectangle
{
private:
    int l =0 , b =0 ;
public:

    void setLB()
    {
        int L , B;
    jump:    
        cout<<"Enter length & breadth: "<<endl;    
        cin>>L>>B;
        if (L>=0 && B>=0)
        {
            l=L;
            b=B;
        }
        else
        {
            cout<<"The length & breadth cannot be negetive"<<endl;
            goto jump;
        }
    }

    int getLength()
    {
        return l;
    }

    int getBreadth()
    {
        return b;
    }

    int area()
    {
        return l*b;
    }
};


int main()
{
    Rectangle r;
    r.setLB();
    cout<<"Length & Breadth are : \n"<<r.getLength()<<endl<<r.getBreadth()<<"\n \tArea: "<<r.area()<<endl;
    return 0;
}

