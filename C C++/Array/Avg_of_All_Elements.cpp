#include <iostream>
using namespace std;
int main()
{
    int A[3][3] , i=1 , sum=0;
    string S[]={""," 1st ", " 2nd ", " 3rd "};
    for (auto& x:A){
        cout<<"Enter"<<S[i]<<"Row : ";
        for (auto& y:x){
            cin>>y;
            sum=sum+y;;
        }
    }
    
    int avg=sum/9;
    cout<<"The Avg of all the elements is = "<<avg<<endl;

    
    for (auto& x:A){
        for(auto& y:x){

            cout<<y<<" ";

        }
        cout<<endl;
    }
    return 0;
}