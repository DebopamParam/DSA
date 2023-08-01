#include <iostream>
using namespace std;
typedef float Total_Amount , Discounted_Bill;
int main()
{
    float a,b,c,d,e;
    Total_Amount T;
    Discounted_Bill DB;
    cout<<"Enter the prices of things you have bought. \n";
    cin>>a>>b>>c>>d>>e;
    T=a+b+c+d+e;
    if (T>=5000)
    {
        DB=T*0.80;
        cout<<"Congratulations. You have got 20% discount on your bill.\nYour net amount is : "<<DB<<"rupees \nOriginal price: "<<T<<"\n Discount: "<<T-DB <<"\n";

    }
    else if(T<5000 && T>=2000)
    {
        DB=T*0.90;
        cout<<"Congratulations. You have got 10% discount on your bill.\nYour net amount is : "<<DB<<"rupees \n (Original price: "<<T<<"\n Discount: "<<T-DB <<"\n";
    }
    else
    {
        DB=T*0.95;
        cout<<"Congratulations. You have got 5% discount on your bill.\nYour net amount is : "<<DB<<"rupees \n (Original price: "<<T<<"\n Discount: "<<T-DB <<"\n";
    }

}