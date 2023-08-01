#include <iostream>
using namespace std;

class Rational
{
private:
    int p , q;
public:
    Rational(int p  , int q );
    ~Rational();

    Rational operator+(Rational &a);

    friend istream& operator>>(istream& i , Rational &r );
    friend ostream& operator<<(ostream& i , Rational &r );
};

Rational::Rational(int p  = 0 , int q = 1)
{
    if (q==0)   
    {
        cout<<"\nIn p/q , q cannot be Zero\n"<<endl;
        exit;
    }
    else
    {
        this->p = p;
        this->q=q;
    }   
}

Rational::~Rational()
{
}

Rational Rational::operator+(Rational &a)
{
    Rational temp;
    temp.p = p+a.p;
    temp.q = q+a.q;
    return temp;
}

istream& operator>>(istream& i , Rational &r )
{
    cout<<"Enter p: ";
    i>>r.p;
jump:    
    cout<<"q: ";
    i>>r.q;
    if(r.q==0)
    {
        cout<<"q cannot be zero"<<endl;
        goto jump;
    }
    return i;

}

ostream& operator<<(ostream& o ,const Rational r )
{
    o<<"The number is :";
    o<<r.p<<"/"<<r.q<<endl;
    return o;
}


int main()
{
    Rational r(3,6) , r2,r3;
    cin>>r2;
    r3=r+r2;
    cout<<r3<<endl;

    return 0;
}