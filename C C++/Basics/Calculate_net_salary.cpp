#include <iostream>
using namespace std;
typedef float basic_salary, percentage_allowances, percentage_deductions, net_salary;
int main()
{
	basic_salary s1;
	percentage_allowances a1;
	percentage_deductions d1;
	net_salary NS;
	cout << "Enter the Basic Salary , Percentage allowances and Percentage deductions. ";
	cin >> s1 >> a1 >> d1;
	NS = s1 + s1 * a1 / 100 - s1 * d1 / 100;
	cout << "The net salary of the Person is : " << NS;
	return 0;
}
