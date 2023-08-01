#include <iostream>
#include <math.h>
using namespace std;

int main()
{
    int n, answer = 0;
    cin >> n;

    for (int i = 0; n != 0; i++)
    {
        int bit = n & 1;
        if (bit == 1)
        {
            answer = answer + (bit * pow(2, i));
        }
        n = n / 10
    }

    cout << answer << endl;

    return 0;
}