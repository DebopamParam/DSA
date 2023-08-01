#include <iostream>
#include<cmath>
using namespace std;
int main()
{
    int a ;
    cout << "Enter a time to check whether it a working hour : " ;
    cin>>a;
    if (a>=9 && a<=17)
    {
        cout<<"It lies under your Workng Hour. ";
    }
    else
    {
        cout<<"You are free. Enjoy. ";
    }
    return 0;
}