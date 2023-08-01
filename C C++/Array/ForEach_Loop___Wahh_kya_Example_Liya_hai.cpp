#include <iostream>
using namespace std;
int main()
{
    int A[3][3] , i=1 , B[3][3]={1,2,3,4,5,6,7,8,9} , C[3][3];
    string S[]={""," 1st "," 2nd "," 3rd "};
    for (auto& x:A){
        
        cout<<"Enter"<<S[i]<<"row : ";

        for (auto& y:x){
            cin>>y;
        }
        ++i;
        cout<<endl;
    }

    for (int i=0 ; i<3 ; i++){
        for (int j=0 ; j<3 ; j++){
            C[i][j]=A[i][j]+B[i][j];
            cout<<C[i][j]<<" ";
        }
        cout<<endl;
    }
    return 0;
}