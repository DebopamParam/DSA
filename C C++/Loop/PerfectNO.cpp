#include <iostream>
using namespace std;
int main()
{
    int n , sum=0 ;
    cout<<"Enter n = ";
    cin>>n;
    //Finding Factors and adding them.
    for (int i=1; i<=n; i++)
    {
        if (n%i==0){
        sum=sum+i;}
    }
    //Perfect Number : The sum of it's factors is Twice than that of the number.
    cout<<"sum is : "<<sum<<"\t";
    if (sum==2*n){
      cout<<n<<" is a perfect number."<<"\t";}
    else{
      cout<<n<<" is not a perfect number."<<"\t";}  
    return 0;
}