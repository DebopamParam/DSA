#include <iostream>
using namespace std;
int main()
{
    int *p = new int[5] , m=0;
    for (int i=0 ; i<5 ; i++){
    cin>>p[i];
    }
    for (int s=0 ; s<5 ; ++s){
        cout<<p[s];
    }
    delete []p;
    p = nullptr;
  return 0;
}