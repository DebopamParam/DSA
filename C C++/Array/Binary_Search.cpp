#include <iostream>
using namespace std;
int main()
{
    int A[]={2,4,6,8,10,12,14,16,18,20} , n = 0;
    for (auto x:A)
    { ++n ;} // n --> Number of elements .

//Let l=Lowest Index     h=highest Index      mid=(lowest+highest)/2
    int l=0 , h=n-1 ,mid , key;
    cout<<"Enter the number you want to find : ";
    cin>>key;
    while (l<=h){

        mid = (l+h)/2 ;

        if (A[mid]==key){
            cout<<"The number is at : "<<mid<<endl;
            return 0;}

        else if (key>A[mid]){
            l=mid+1;}

        else if(key<A[mid]){
            h=mid-1;}
    }
    cout<<"Not Found";
    return 0;
}