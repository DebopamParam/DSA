#include <iostream>
using namespace std;
#include <cmath>
typedef int age;
int main()
{
    age a;
    cout<<"Enter your age : ";
    cin>>a;
    if (a<12 || a>50)
    {
        cout<<"Sorry you are Young/Old. ";
    }
    else
    {
        cout<<"Congratulations. You  are eligible for this offer. ";
    }
    return 0;

}