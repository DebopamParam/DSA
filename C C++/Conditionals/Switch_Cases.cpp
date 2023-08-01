#include <iostream>
using namespace std;
int main()
{
    int day=2;
    cout<<"Enter day no : ";
    cin>>day;
    switch(day)
    {
        case 1: cout<<"Mon";
        break;
        case 2: cout<<"Tue";
        break;
        case 3: cout<<"Wed";
        break;
        case 4: cout<<"Thu";
        break;
        case 5: cout<<"Fri";
        break;
        case 6: cout<<"Sat";
        break;
        case 7: cout<<"Sun";
        break;
        default: cout<<"Invalid Input";
        break;
    }
    return 0;
}