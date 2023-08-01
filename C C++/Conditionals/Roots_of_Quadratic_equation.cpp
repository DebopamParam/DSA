#include <iostream>
#include <cmath>
using namespace std;
int main()
{
    float a , b , c , D , r1 , r2 , real , imag ;
    cout<<"Enter a , b , c respectively : "<<"\t";
    cin>>a>>b>>c;
    D=b*b - 4*a*c;
    if (D==0)
    {
        r1= -b/(2*a);
        cout<<"The roots are real & equal."<<"\t";
        cout<<"r1= "<<r1<<"     r2= "<<r1;
    }
    else if (D>0)
    {
        r1=(-b+sqrt(D)) / (2*a);
        r2=(-b-sqrt(D)) / (2*a);
        cout<<"The roots are real and distinct. "<<"\t";
        cout<<"r1= "<<r1<<"    r2= "<<r2<<endl;

    }
    else 
    {
        cout<<"The roots are imaginary & distinct. "<<"\t";
        real=(-b/(2*a));
        imag= (sqrt(-D)) / (2*a);
        cout<<"r1 = "<<real<<" + "<<imag<<" i"<<"\t";
        cout<<"r2 = "<<real<<" - "<<imag<<" i"<<"\t";
    }
    return 0;
}    