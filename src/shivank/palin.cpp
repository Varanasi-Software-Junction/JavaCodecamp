#include <iostream>
using namespace std;


int palin(int num)
{
    
    
    int s=0;
    while(num>0)
    {
    int rem=num%10;
    s=s*10+rem;
    num/=10;
    


    }
    return s;
}
int main()
{

    int t;
    cin>>t;
    int a=palin(t);
    if(a==t)
    cout<<t<<" is Palindrome";
    else
    cout<<t<<" is not Palindrome";

}