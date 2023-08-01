#include <iostream>
using namespace std;

class Base
{
    private:
        int a;

    protected:
        int b;

    public:
        int c;

    void BaseFunc()
    {
        a=10;
        b=20; //All the Data members are Accessible
        c=40;
    }
};

class Derived:public Base
{
    public:
        void DerivedFunc()
        {
            //a=10;   // Private cannot be accessed within the derived class 
            b=20; //✔️
            c=30; //✔️

        }

};

int main()
{
    Derived debopam;
    //debopam.a=10 //❌
    //debopam.b=20 //❌

    debopam.c=30; //✔️

    cout<<debopam.c<<endl;
    return 0;
}