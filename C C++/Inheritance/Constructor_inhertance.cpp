#include <iostream>
using namespace std;

class Base
{
    public:
    Base(){cout<<"Base constructor"<<endl;};
    Base(int a){cout<<"Base parameterised Constructor "<<a<<endl;};
};

class Derived:public Base
{
    public:
    Derived(){cout<<"Derived constructor"<<endl;};
    Derived(int x)
    {
        cout<<"Parameterised Derived constructor "<<x<<endl;
    }
    Derived(int x , int y):Base(x) //Calls the Base Parameterised Constructor
    {
        cout<<"Parameterised Derived constructor "<<x<<y<<endl;
    }
};


int main()
{
    Derived d(2,5);
    return 0;
}