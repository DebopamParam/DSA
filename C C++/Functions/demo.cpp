#include <iostream>
using namespace std;

float pow (float x, float y)
{
    float result = 1;
    while (y--)
    {
        result = result * x ;
    }
    return result;
}

int main()
{
    cout<<pow(3.6,4)<<endl;
    return 0;
}