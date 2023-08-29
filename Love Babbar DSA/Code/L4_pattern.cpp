#include <iostream>
using namespace std;

int main()
{
    // for(int i = 0; i < 4; i++)
    // {
    //     for(int j=0;j<=i;j++)
    //     {
    //         cout<<i+j+1<<" ";
    //     }
    //     cout<<endl;
    // }

    // for(int i = 1; i <=4; i++)
    // {
    //     for(int j = 1; j<=i;j++)
    //     {
    //         cout<<i-j+1<<" ";
    //     }
    //     cout<<endl;
    // }

    // for (int i = 0; i < 4; i++)
    // {
    //     for (int j = 0; j < 4; j++)
    //     {
    //         cout<<(char)(65+j)<<"  ";
    //     }
    //     cout<<endl;
    // }

    // int m=0;
    // for (int i = 0; i < 5; i++)
    // {
    //     for (int j = 0; j <5; j++)
    //     {
    //         cout<<(char)(65+(m++))<<"   ";
    //     }
    //     cout<<endl;
    // }

    // for (int i = 0; i < 3; i++)
    // {
    //     for (int j = 0; j<3; j++)
    //     {
    //         cout<<(char)(65+j+i)<<"  ";
    //     }
    //     cout<<endl;
    // }

    // int x=0;

    // for (int i = 0; i < 4; i++)
    // {
    //     for (int j = 0; j <=i; j++)
    //     {
    //         cout<<(char)(65+(x++))<<"  ";
    //     }
    //     cout<<endl;

    // }

    // for (int i = 0; i < 4; i++)
    // {
    //     for (int j = 0; j <=i; j++)
    //     {
    //         cout<<(char)(65+i+j)<<"  ";
    //     }
    //     cout<<endl;

    // }

    // int a ='D';

    // for (int i = 0; i < 4; i++)
    // {
    //     for (int j = 0; j <=i; j++)
    //     {
    //         cout<<(char)(a+j)<<"  ";
    //     }
    //     a--;
    //     cout<<endl;
    // }

    // int n=4;
    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j < n; j++)
    //     {
    //         if ((i+j)<n-1)
    //         {
    //             cout<<"  ";
    //         }
    //         else
    //         {
    //             cout<<" *";
    //         }
    //     }
    //     cout<<endl;
    // }

    // int n=4;

    // for (int i = 0; i < n; i++)
    // {
    //     for(int j = 0 ; (i+j)<n;j++)
    //     {
    //         cout<<"* ";
    //     }
    //     cout<<endl;
    // }

    // int n=4;
    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j < n; j++)
    //     {
    //         if (j>=i)
    //         {
    //             cout<<"* ";
    //         }
    //         else
    //         {
    //             cout<<"  ";
    //         }
    //     }
    //     cout<<endl;
    // }

    int n = 4;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (j >= i)
            {
                cout << i + 1 << " ";
            }
            else
            {
                cout << "  ";
            }
        }
        cout << endl;
    }

    // int n = 4;
    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j < n; j++)
    //     {
    //         if ((i + j + 2) > n)
    //         {
    //             cout << i + 1 << " ";
    //         }
    //         else
    //         {
    //             cout << "  ";
    //         }
    //     }
    //     cout << endl;
    // }

    // int n = 4, a = 1;
    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j < n; j++)
    //     {
    //         if ((i + j + 2) > n)
    //         {
    //             cout << a++ << " ";
    //         }
    //         else
    //         {
    //             cout << "  ";
    //         }
    //     }
    //     cout << endl;
    // }

    return 0;
}
