#include <iostream>
#include <string>
#include <algorithm>
#include <cstring>
using namespace std;

//Palindrome - easy way  (Import <algorithm>)
//     string isPalindrome(string s)
//     {
//         string p=s;
//         reverse(s.begin(),s.end());
//         if (s==p)
//         return "Yes , It is a palindrome";
//         else 
//         return "No, it is not a palindrome";
//     }

// int main()
// {
//     string s;
//     cout<<"Enter a string to check : \t";
//     getline(cin,s);
//     cout<<isPalindrome(s)<<endl;
    
//     return 0;
// }



//Cool way
// int main()
// {
//     string s ;
//     cout<<"Enter a string : \t";
//     getline(cin,s);
//     int flag = 0 , l = s.length();
//     for (int i = 0 ; i!=(l/2) ; i++)
//     {
//         if (s[i]!=s[l-i-1]) //abcba
//         {
//            flag = 1 ;
//         }
//     }

//     if (flag == 1)
//     {
//         cout<<"\nNot Palindrome."<<endl;
//     }
//     else 
//     {
//         cout<<"\npalindrome\n"<<endl;
//     }

//     return 0;
// }

int main()
{
    string s , rev = "";
    // char rev[100];
    cin>>s;
    transform(s.begin(),s.end(),s.begin(),::toupper);
    int l=s.length();
    rev.resize(l);
    for (int i=0 ; i<l ; i++)
    {
        rev[i]=s[l-i-1];
    }
    if (s.compare(rev)==0)
    {
        cout<<"\nPalindrome"<<endl;
    }
    else
    {
        cout<<"\n not a palindrome"<<endl;
    }

    return 0;
}
