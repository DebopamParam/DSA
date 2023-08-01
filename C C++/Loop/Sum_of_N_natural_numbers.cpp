#include <iostream>
using namespace std;
int main()
{
    int n , max=0;
    cout<<"The max of first n numbers --> Enter n : ";
    cin>>n;
    
    for (int i =0 ; i<=n; ++i)
    {
        max=max+i; // or we can use max+=i 
    }
    cout<<"The max is : " << max << "\t";

    return 0;
}