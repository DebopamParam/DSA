#include <iostream>
using namespace std;
int main()
{
    int year;
    cout<<"Enter year to check : "<<"\t";
    cin>>year;

    //if year is divisible by 4 and not divisible by 100
    // & if a year is divisible by 400 
    // It is a leap year.
    if (year%4==0 && year%100!=0 || year%400==0)
         cout<<year<<" is leap year.";
    else 
         cout<<year<<" is not a leap year.";
    return 0;         
}