#include <iostream>
#include <string>
using namespace std;

class student
{
private:
    float physics, chem , maths , per ;
    string name ;
    int roll;
public:
    student(const string &n ,int r ,float m1 ,float m2 ,float m3);
    ~student();
    void percentage();
};

student::student(const string &n ,int r ,float m1 ,float m2 ,float m3)
{
    name=n;
    roll=r;
    physics=m1;
    chem=m2;
    maths=m3;
    per=0;
}

student::~student()
{
}

void student::percentage()
    {
        float p ;
        p=(physics+chem+maths)/3;
        cout<<"You got "<<p<<"%"<<endl;
    }



int main()
{
    float p,c,m;
    int roll;
    string name;
    cout<<"Name: ";
    cin>>name;
    cout<<"Roll: ";
    cin>>roll;
    cout<<"Enter your marks\nPhysics: ";
    cin>>p;
    cout<<"Chemistry: ";
    cin>>c;
    cout<<"Maths: ";
    cin>>m;
    student s(name , roll , p , c , m);
    s.percentage();
    return 0;
}