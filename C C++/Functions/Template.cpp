#include <iostream>
using namespace std;

template <class T>
T maximum(T a , T b)
{
    return a>b?a:b;
}

int main()
{
    char x , y;
    cin>>x>>y;
    cout<<maximum(x, y)<<endl;

    
}