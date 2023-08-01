#include <iostream>
#include <string>
using namespace std;

int main()
{
    char a[] = {'P', 'a', 'r', 'a', '\0' ,'m' };
    cout << a << " " << endl;

    char *p = &a[0];

    while (*p != '\0')
    {
        cout<<*(p++);
    }
    cout<<endl;
    
    return 0;
}