#include <iostream>
#include <bitset>
#include <math.h>
using namespace std;

// bitset<8> toBinary(int n)
// {
//     return bitset<8>(n);
// }

// int main()
// {
//     int n = 123;
//     cout << "Answer: " << toBinary(n) << endl;

//     return 0;
// }
int main()
{
    int n = 5;
    cout << (n & 7) << endl;
    return 0;
}