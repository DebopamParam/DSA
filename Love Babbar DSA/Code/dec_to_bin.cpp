#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int n, digit, answer = 0, i = 0;
    cout << "Enter a number to check: ";
    cin >> n;

    while (n != 0)
    {
        digit = n & 1;
        n = n >> 1; // Right shifting n by 1bit (Divided by 2)
        answer = (digit * pow(10, i)) + answer;
        i++;
    }

    cout << answer << endl;
    return 0;
}