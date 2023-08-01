#include <iostream>
using namespace std;
int main()
{
    int n , i=2;
    cout<<"Enter upto which you want to count";
    cin>>n;
    while (i<=n)
    {
        cout<<i<<"\t";
        i=i+2;
    }
    return 0;
}