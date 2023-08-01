#include <iostream>
using namespace std;
int main()
{
    int m , n;
    cout<<"Enter two numbers : ";
    cin>>m>>n;
    while (n!=m){

    if (m>n){
        m=m-n;
    }
    else if (n>m){
        n=n-m;
    }
    }
    cout<<"The GCD is "<<m;
    return 0;
}