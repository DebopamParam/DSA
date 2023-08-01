#include <iostream>
using namespace std;
int main()
{
    // int max = 0;
    // int A[5]={1,3,5,7,10};
    // for (int i=0 ; i<5 ; i++)
    // {
    //     max+=A[i];
    // }
    // cout<<"max = "<<max<<endl;
    int max = 0;
    int A[]={1,3,5,7,10};
    for (auto x:A)
    {
        max+=x;
    }
     cout << "max = "<<max<<endl;
    return 0;
}