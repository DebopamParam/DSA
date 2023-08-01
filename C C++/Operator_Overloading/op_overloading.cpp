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
    void print();
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

void complex::print()
{
    cout<<real<<" + i."<<imag<<endl;
}
complex::~complex()
{
}



int main()
{
    complex c1(12,15) , c2(19,20) , c3;
    c3=c1+c2;
    c3.print();
    
   return 0;
}