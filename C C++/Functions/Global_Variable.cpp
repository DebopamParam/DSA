#include <iostream>
using namespace std;

int g=0;

void fun()
{
    int a =5;  // "a" will get deleted after the function ends
    g=10;
    g=g+a;
    cout<<g<<endl;
}

int main()
{
    fun();
    g++;
    cout<<g<<endl;
    return 0;
}