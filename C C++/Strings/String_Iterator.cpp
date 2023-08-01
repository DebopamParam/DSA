#include <iostream>
#include <string>
using namespace std;

int main()
{
    /* String Iterator */
    string s = "debopam chowdhury";
    string :: iterator it ;
    for (it=s.begin();it!=s.end();it++)
    {
        *it=*it-32;
    }
    cout<<s<<endl;
    
    string :: reverse_iterator ti ;
    for (ti=s.rbegin();ti!=s.rend();ti++)
    {
        cout << *ti ;
    }
    cout<<endl;
    
    return 0;
}