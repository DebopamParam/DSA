#include <iostream>
using namespace std;
int main()
{
    int n , d;
    cout<<"Enter the number : ";
    cin>>n;
    while (n>0)
    {
        d=n%10;
        cout<<d<<endl;
        n/=10;
    }
    
    
    return 0;
}