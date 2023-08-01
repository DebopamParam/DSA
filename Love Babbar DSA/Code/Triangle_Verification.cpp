#include <iostream>
using namespace std;

int main()
{
    int a , b , c;
    cout<<"Enter the sides of the Triangle: ";
    cin>>a>>b>>c;

    if ((a+b)>c && (a+c)>b && (b+c)>a)
    {
        cout<<"It is a valid triangle "<<endl;
    }
    else
    {
        cout<<"It is not a valid triangle "<<endl;
    }
    return 0;
}