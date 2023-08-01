#include <iostream>
using namespace std;


float add(float x , float y)
{
    float z;
    z=x+y;
    return z;
}

float sub(float x , float y)
{
    float z;
    z=x-y;
    return z;
}

float mul(float x , float y)
{
    float z;
    z=x*y;
    return z;
}

float div(float x , float y)
{
    if (y!=0)
    {
    float z;
    z=x/y;
    return z;
    }
    else 
    {
        return 0;
    }
}



int main()
{
    float a=div(1.1,2.3);
    cout<<a<<endl;
    return 0;
}