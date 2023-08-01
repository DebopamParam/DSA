#include <iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter the number upto which you want to count : ";
    cin>>n;
    for (int i=1 ; i<=n ; i=i+2)
    {
        cout<<i<<"\t";
    }
    return 0;
}