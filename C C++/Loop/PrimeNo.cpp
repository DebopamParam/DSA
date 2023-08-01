#include <iostream>
using namespace std;
int main()
{
    int n , count = 0 ;
    cout << "Enter n : ";
    cin>>n;
//1. Finding Factors.
//2. Count the number of Factors.
    for (int i=1 ; i<=n ; i++)
    {
        if (n%i==0)
        {
            ++count;
        }
    }
    if (count==2)
     cout<<"prime number"<<"\t";
    else
     cout<<"Not a prime number"<<"\t"; 


    return 0;
}