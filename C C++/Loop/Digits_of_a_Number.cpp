#include <iostream>
using namespace std;

int main()
{
    int n ;
    cout<<"Enter the number : ";
    cin>>n;

    for (int i=1 ; n>0 ; n=n/10)
    {
        cout<<" Digit of "<<i<<"'s place = "<<n%10<<"\n";
        i*=10;
    }
    return 0;
}