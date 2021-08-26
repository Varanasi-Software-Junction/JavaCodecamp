#include <iostream>
#include <string.h>
using namespace std;
int main()
{
    string s1,s2;
    cin>>s1>>s2;
    if((sizeof(s1))!=(sizeof(s2)))
    {cout<<"No anagram possible ";
        return 0;
    }
    cout<<sizeof(s1)/4;
    for(int i=0;i<sizeof(s1)/8;i++)
    {
        for(int j=0;i<sizeof(s2)/8;i++)
    {
            if(s1[i]==s2[j])
            {
             s1[i]=' ';
             s2[j]=' ';
            }
            
            
            


    }
    cout<<s1<<" "<<s2;
    if(s1==s2)
            {
                cout<<"Anagram";
                return 0;
            }
    }
    cout<<"NO anangram";

}
