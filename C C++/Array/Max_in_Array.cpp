#include <iostream>
using namespace std;
int main()
{

    //Best way to do it where you don't need to know the number of elements in the Array...
    int A[]={2,4,6,8,7,5,3};
    int max = A[0];
    for (auto x:A){
        if (x>max){
            max=x;
        }
    }
    cout<<"max = "<<max<<endl;
}