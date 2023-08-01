#include <iostream>
using namespace std;

int main()
{
    int n ;
    cout<<"Enter n : ";
    cin>>n;


    int arr[n];
    for(int i=0; i<n; i++)
    {
        cin>>arr[i];
    }

    
    for (int i=0; i<n-1; i++)
    {
        bool swapped = false;
        for(int j=0; j<n-i-1; j++)
        {
            if(arr[j]>arr[j+1])
            {
                swap(arr[j+1],arr[j]);
                swapped = true;
            }
        }
        if (!swapped)
        {
            break;
        }

    }

    cout<<"After being sorted : "<<endl;

    for (int i=0; i<n; i++)
    {
        cout<<arr[i]<<"\t";
    }


    return 0;
}