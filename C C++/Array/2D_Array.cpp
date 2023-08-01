#include <iostream>
using namespace std;
int main()
{

    // int A[2][3]={1,2,3,4,5,6};   You can also fillup like this . It will arrange itself
    //automatically. As the data allocation is still linear ,just the representation is 2D.

    int A[2][3]={{1,2,3},{4,5,6}};
    for (int i=0 ; i<2 ; ++i){
        for (int j=0 ; j<3 ; ++j){
            cout<<A[i][j]<<" ";
        }
        cout<<endl;
    }
    return 0;
}