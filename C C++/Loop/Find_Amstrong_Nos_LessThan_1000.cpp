#include <iostream>
#include <cmath>
using namespace std;

int main() {

  int num1, num2, i, num, digit, max, count;

  cout << "Enter first number: ";
  cin >> num1;

  cout << "Enter second number: ";
  cin >> num2;

  // swap if num1 > num2
  if (num1 > num2) {
    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;
  }
  
  cout << "Armstrong numbers between " << num1 << " and " << num2 << " are: " << "\t";
 
  // print Armstrong numbers from num1 to num2
  for(i = num1; i <= num2; i++) {

    // count gives the number of digits in i
    count = 0;
         
    // store value of i in num
    num = i;

    // count the number of digits in num and i
    while(num > 0) {
      ++count;
      num /= 10;
    }
 
    // initialize max to 0
    max = 0;

    // store i in num again    
    num = i;
        
    // get max of power of all digits of i
    while(num > 0) {
      digit = num % 10;
      max = max + pow(digit, count);
      num /= 10;
    }

    // if max is equal to i, then it is Armstrong
    if(max == i) {
      cout << i << ", ";
    }
  }

  return 0;
}