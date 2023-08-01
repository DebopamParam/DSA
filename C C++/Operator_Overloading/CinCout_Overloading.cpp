#include <iostream>
using namespace std;

class complex
{
private:
    float real , imag ;
public:
    complex(float r , float i);
    ~complex();
    complex operator +(const complex &x);//Operator Overloading
    friend ostream& operator<<(ostream& os, complex& c);
    friend istream& operator>>(istream& is, complex& c);
    
};

complex::complex(float r=0 , float i=0)
{
    real=r;
    imag=i;
}

complex complex::operator +(const complex &x)//Operator Overloading
{
    complex temp;
    temp.real=real+x.real;
    temp.imag=imag+x.imag;
    return temp;
}

complex::~complex()
{
}

ostream& operator<<(ostream& os, complex& c)
{
    os<<c.real<<" + "<<c.imag<<"i";
    return os;
}

istream& operator>>(istream& is, complex& c)
{
    cout<<"Real:\t";
    is>>c.real;
    cout<<"Imag:\t";
    is>>c.imag;
    return is;
}


int main()
{
    complex c1(12,15) , c2(19,20) , c3;
    c3=c1+c2;
    cout<<c3<<endl;
    cin>>c3;
    cout<<c3;
    return 0;
}