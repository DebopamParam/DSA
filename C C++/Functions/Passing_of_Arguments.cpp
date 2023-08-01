#include <iostream>
using namespace std;

//Pass by reference
void swap(int &x , int &y)
{
    int temp ;
    temp = x;
    x=y;
    y=temp;
}

int main()
{
    int a , b;
    cout<<"Enter two numbers a & b : "<<endl;
    cin>>a>>b;
    cout<<"Before Swapping:"<<a<<" "<<b<<endl;

    swap(a,b);

    cout<<"After Swapping:"<<a<<" "<<b<<endl;
    return 0;
}



//Pass by Address
// void swap(int *x , int *y)
// {
//     int temp ;
//     temp = *x;
//     *x=*y;
//     *y=temp;
// }

// int main()
// {
//     int a , b;
//     cout<<"Enter two numbers a & b : "<<endl;
//     cin>>a>>b;
//     cout<<"Before Swapping:"<<a<<" "<<b<<endl;
//     swap(&a,&b);
//     cout<<"After Swapping:"<<a<<" "<<b<<endl;
//     return 0;
// }