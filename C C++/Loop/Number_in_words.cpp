#include <iostream>
using namespace std;
int main()
{
    int n , rev=0 , r , digit ;
    cout<<"Enter the number : ";
    cin>>n;
    while (n>0)
    {
        r=n%10;
        n/=10;
        rev=rev*10 + r;
    }
    while (rev>0){
        digit=rev%10;
        rev/=10;
        switch (digit){
            case 1 : cout<<"one"<<"\t"; 
            break;
            case 2 : cout<<"two"<<"\t"; 
            break;
            case 3 : cout<<"three"<<"\t"; 
            break;
            case 4 : cout<<"four"<<"\t"; 
            break;
            case 5 : cout<<"five"<<"\t"; 
            break;
            case 6 : cout<<"six"<<"\t"; 
            break;
            case 7 : cout<<"seven"<<"\t"; 
            break;
            case 8 : cout<<"eight"<<"\t"; 
            break;
            case 9 : cout<<"nine"<<"\t"; 
            break;
            default : cout<<" Zero "<<"\t";
            break;

        }
    }
    return 0;
}