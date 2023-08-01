#include <iostream>
using namespace std;

const int n=5;

void search(int const x[],int key) 
{
    bool found=false;
    
    for (int i = 0; i <n;i++) 
    {
        if (x[i] == key)
        {cout<<"Element is found at "<<i+1<<endl;
        found=true;
        break;}
    }

    if(found==false)
        {
            cout<<"The element is not found"<<endl;
        }

}

int main()
{   
    int a[n];

    cout<<"Enter the elements of the array: ";

    for (int i = 0; i < n; i++)
    {
        cin>>a[i];
    }

    search(a,78);
    
    return 0;
}