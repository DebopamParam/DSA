#include <iostream>
using namespace std;


class Complex
{
private:
    int real, imag;
public:
    Complex(int r,int i);     
    ~Complex();
    friend Complex operator+(Complex c1,Complex c2); // Friend function
    void print()
    {
        cout<<real<<" + "<<imag<<" i"<<endl;
    }
};

Complex::Complex(int r=0,int i=0)
{
    real = r;
    imag = i;
}

Complex::~Complex()
{}

Complex operator+(Complex c1,Complex c2) //Friend function Definition
{
    Complex t;
    t.real = c1.real + c2.real;
    t.imag = c1.imag + c2.imag;
    return t;
}


int main()
{
    Complex c1(2,4),c2(6,9),c3;
    c3=c1+c2;
    c3.print();
    return 0;
}