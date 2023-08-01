#include <iostream>
using namespace std;
int main()
{
    int i=0;
    for (;;)
    {
        cout <<i<<" Hello"<<"\n";
        ++i;
        //To break this infinite loop we use break statement with a condition.
        if (i>10)
        {
            break;
        }
    }
}