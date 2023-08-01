#include <iostream>
#include <cmath>
using namespace std;
int main()
{
    float m1,m2,m3,avg;
    cout<<"Enter your marks:  \n";
    cin>>m1>>m2>>m3;
    avg=(m1+m2+m3)/3;
    if (avg>=60)
      cout<<"Your grade is : A \n";
    else if (avg<60 && avg>=35)
       cout<<"Your grade is : B \n";
    else
       cout<<"fail. \n";     
    return 0;
}