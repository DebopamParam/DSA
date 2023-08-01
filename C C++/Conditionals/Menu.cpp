#include <iostream>
using namespace std;
int main()
{
    cout<<"Menu\n";
    cout<<"1.Add\n"<<"2.Subtract\n"<<"3.divide\n"<<"4.multiply\n";

    int options;
    cout<<"Enter your choice : ";
    cin>>options;
    if (options<0 || options>4)
    { cout<<"Enter a valid operation no. ";}
    else
    {
        float a,b,c;
        cout<<"Enter two numbers : ";
        cin>>a>>b;
        switch(options)
        {
        default: cout<<"Null";
        break;
        case 1: c=a+b; 
        break;
        case 2: c=a-b;
        break;
        case 3: c=a/b;
        break;
        case 4: c=a*b;
        break;

        }
    cout<<"The result is "<<c; 
    }
    return 0;
}