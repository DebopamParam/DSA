#include <iostream>
using namespace std;
int main()
{
    int number , remainder , m , reverse=0 ;
    cout<<"Enter the number : ";
    cin>>number;
    m = number;
    while (number > 0){
        remainder=number%10;
        reverse = reverse *10 + remainder;
        number/=10;
    }
    if (reverse==m)
    cout <<"It is a Palindrome. ";
    else 
    cout<<"Not a Palindrome. ";
    return 0;
}