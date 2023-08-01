//The task is to check if a person is young(12-50) so that he can avail some govt. offers.
#include <iostream>
using namespace std;
int main()
{
    int age;
    cout<<"Enter your age : ";
    cin>>age;
    if (age>=12 && age<=50)
        cout<<"Congratulations. You are eligible for this offer. ";
    else if (age<=12)
        cout<<"Sorry you are too young :(";
    else
        cout<<"Sorry you are too old :( ";
    return 0;            
}

//Better way to do this is to use OR operator(||) 