//the Armstrong number definition is the number in any given number base,
//which forms the total of the same number, when each of its digits is 
//raised to the power of the number of digits in the number.
#include <iostream>
#include<cmath>
using namespace std;
int main()
{
    int num , OriginalNum , remainder , n=0 , result = 0 , power ;
    cout<<"Enter the number : ";
    cin>>num;
    OriginalNum = num;

    //n = no. of digits of the number (153 --> 3 digits)

    while (OriginalNum > 0){
        OriginalNum/=10;
        ++n;
    }
    OriginalNum =num;
    while (OriginalNum > 0){
        remainder=OriginalNum % 10;
        // round() returns the equivalent int
        power = round(pow(remainder,n));
        result+=power;
        OriginalNum/=10;
    }
    if(result==num){
        cout<<"The number is an Armstrong number. ";
    }
    else {
        cout<<"The number is not an Armstrong number. ";
    }
    return 0;
}