#include <iostream>
using namespace std;
int main()
{
    int a , b  , prime = 0 , notPrime = 0;
    cout<<"Enter the range a___b : " ;
    cin>>a>>b;
    for (int n=a ; n<=b ; ++n)
    {
        int count=0;
        for (int i=1 ; i<=n ; i++)
       {
        if (n%i==0)
          {
            ++count;
          }
       }
    //if we want to display each term is prime or not between 1 to 100 ↓   
    // if (count==2)
    //  cout<<n<<" is prime"<<"\t";
    // else
    //  cout<<n<<" is not a prime number"<<"\t"; 
    // }
      if (count==2)
        ++prime;
      else
        ++notPrime; 
    }
    cout << "The number of prime numbers : " << prime << "\t";
    cout<<"The number of nonPrime numbers : "<<notPrime << "\t";
    return 0;
}