// * 
// * * 
// * * * 
// * * * *

#include <iostream>
using namespace std;
int main()
{
    //Loop created by i forms rows 
    // "     "     "  j   "    columns
    for (int i=1 ; i<=4 ; i++)
    {
        for (int j=1 ; j<=4 ; j++)
        {
            if (j<=i){
                cout<<"* ";
            }
            else 
            break;
        }
        cout<<endl;
    }
    return 0;
}