#include <iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter the number which's table you want to know : ";
    cin>>n;
    for (int i=1 ; i<=10 ; ++i)
    {
        cout << n <<" x "<< i <<" = " << n*i << "\t";
    }
    return 0;
}