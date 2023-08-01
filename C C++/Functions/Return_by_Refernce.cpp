#include <iostream>
using namespace std;

int & fun(int &x)
{
    cout<<x<<endl;
    return x;
}

int main()
{
    int a = 5;
    fun(a)=15;
    cout<<a<<endl;
    return 0;
}