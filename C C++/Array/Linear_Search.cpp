#include <iostream>
#include <sstream>
#include <limits>
#include <vector>
using namespace std;
int main()
{
    int A[10], n=10 , key ;
    cout <<"Enter the numbers on the list : "<<endl;
    for (int i=0 ; i<n ; i++){
        cin>>A[i];
    }
    cout<<"Enter the key that you want to find : ";
    cin>>key;
    for (int i ; i<n ; i++ ){
        if (key == A[i]){
            cout<<"The position of the Element is at the index : "<<i;
            exit(0);
        }
    
    }
    cout<<"Not found.";

    return 0;
}