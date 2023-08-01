#include <iostream>
using namespace std;

template<class T>
T add(T a , T b ,T c=0 ,T d=0)
{
    return a+b+c+d;
}

template<class T>
T maximum(T a , T b ,T c=0 )
{
    return a>b && a>c? a : (b>c? b : c);
}

int main()
{
    cout<<maximum(9,7)<<endl;
    return 0;
}