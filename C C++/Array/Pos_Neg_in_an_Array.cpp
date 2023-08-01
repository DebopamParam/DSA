#include <iostream>
using namespace std;
int main()
{
    int A[9]={2,5,3,-9,-6,4,-8,-2,7} , pos=0 , neg=0 ;


    // for (int i = 0 ; i<9 ; ++i) {
    //     if (A[i]<0)
    //     ++neg;
    //     else
    //     ++pos;
    // }



    for (auto x:A){
        if (x>0){
            ++pos;
        }
        else{
            ++neg;
        }
    }


    cout<<"No of positive numbers = "<<pos<<endl;
    cout<<"No of Negetive numbers = "<<neg<<endl;
    return 0;
}