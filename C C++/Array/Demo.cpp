#include <iostream>
using namespace std;
int main()
{
    int A[2][3]={1,2,3,4,5,6};
    for (auto& x:A){
        for(auto& y:x){

            cout<<y<<" ";

        }
        cout<<endl;
    }
    return 0;
}