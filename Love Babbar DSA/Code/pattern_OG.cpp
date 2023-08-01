#include <iostream>
using namespace std;

int main()
{

    // int n;
    // cout<<"Enter the value of n: ";
    // cin>>n;
    // for (int i = 1; i <=n; i++) // i will print row
    // {
    //     for (int j = 0; j+i<=n; j++)
    //     {
    //         cout<<"  ";
    //     }
    //     for (int k=1 ;  k<=i  ;  k++)
    //     {
    //         cout<<k<<" ";
    //     }
    //     for(int l=i-1;l>=1;l--)
    //     {
    //         cout<<l<<" ";
    //     }

    //     cout<<endl;
    // }

    int n;
    cout << "Enter the value of n: ";
    cin >> n;

    for (int row = 1; row <= n; row++)
    {
        for (int i = 1; i <= (n - row + 1); i++)
        {
            cout << i << "  ";
        }

        for (int j = 1; j <= (row - 1) * 2; j++)
        {
            cout << "*  ";
        }

        // for(int k=row;k>=2;k--)
        // {
        //     cout<<"*  ";
        // }

        for (int i = (n - row + 1); i >= 1; i--)
        {
            cout << i << "  ";
        }

        cout << endl;
    }

    return 0;
}