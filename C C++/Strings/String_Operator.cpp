#include <iostream>
using namespace std;

int main()
{

    // string s1 = "Hello ",s2="World";
    // cout<<s1+s2+" Oh yeah I'm here Baby!!!\n"<<endl;
    // s1=s2;
    // cout<<s1<<" -- oops we interchanged "<<endl;


    string str = "Hello world ";
    string::iterator it;
    for (it=str.begin();it!=str.end();it++)
    {
        cout<<*it;
    }
    cout<<endl;
        

    return 0;
}