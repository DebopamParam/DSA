#include <iostream>
#include <algorithm>
#include <string>
#include <cstring>
using namespace std;
int main()
{
    //// Length of the string using iterator
    // string s= "Welcome";
    // int count = 0;
    // string :: iterator it;
    // for (it = s.begin(); it !=s.end(); ++it)
    // {
    //     count++;
    // }
    // cout<<count<<endl;



    // //Upper Case to Lower Case 
    // string s = "WELCOME BACK MOTHERFUCKERS";
    // string :: iterator it ;
    // for (it = s.begin(); it != s.end(); ++it)
    // {
    //     *it = *it+32;
    // }
    // cout<<s<<endl;



    //// Easier Method (Import <algorithm>)
    // string input;
    // getline(cin,input);
    // transform(input.begin(), input.end(), input.begin(), :: toupper);
    // cout << input;




    ////Number of words , vowels , consonants
    // string s="Hello.       How Are you all doing?";
    // string:: iterator it;
    // int word = 0 , vowels = 0 , consonants = 0 ;
    // for (it=s.begin();it!=s.end();++it)
    // {
    //     if (*it==' ')
    //     {
    //         if (*++it==' ')  // for more than one spaces 
    //         {
    //             exit;
    //         }
    //         else
    //         {word++;}  //No. of word = no. of spaces + 1
    //     }
    //     else
    //     {
    //         exit;
    //     }

    //     if (*it == 'a' || *it == 'e' || *it == 'i' || *it == 'o' || *it == 'u' || *it == 'A' || *it == 'E' || *it == 'I' || *it == 'O' || *it == 'U' )
    //     {
    //         vowels++; 
    //     }
    //     else if ((*it>='a' && *it<='z') || (*it>='A' && *it<='Z'))
    //     {
    //         consonants++;
    //     }
    // }
    // cout<<"No of word is = "<<word+1<<endl;
    // cout<<"No of vowels are = "<<vowels<<endl;
    // cout<<"No of consonants are = "<<consonants<<endl;



    
    //Reverse of a string - Method 1
    // string s="Debopam Chowdhury" ,p=s;
    // reverse(s.begin(),s.end());
    // cout<<p<<endl;//Original
    // cout<<s<<endl;//Reverse

    //Method-2
    // string s="Debopam Chowdhury",backup=s;
    // char ch;
    // for (int i = 0 , len=s.length();i<len/2;i++){
    //     ch = s[i];
    //     s[i]=s[len-i-1];
    //     s[len-i-1]=ch;
    // }
    // cout<<s<<endl;//Reverse
    // cout<<backup<<endl;//Original



    return 0;
}