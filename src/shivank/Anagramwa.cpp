#include <iostream>
#include <string.h>
using namespace std;
int main()
{
    string s,s1;
    cout<<"Enter two string to check Anagram: ";
    cin>>s>>s1;
    string first=s,second=s1;
    if(s.length()!=s1.length())
    {cout<<"NO anagram";
        return 0;
    }
    for(int i=0;i<s.length();i++)
    {
        for(int j=0;j<s1.length();j++)
        {
                if(s[i]==s1[j])
                {
                    s[i]=' ';
                    s1[j]=' ';
                }
        }
    }
    if(s==s1)
    cout<<"Anagram";
    else
    cout<<"Values "<<first<<" and "<<second<<" are NO anagram";


}