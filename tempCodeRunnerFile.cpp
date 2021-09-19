#include <bits/stdc++.h>
using namespace std;
#define FASTIO ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0)
#define ll long long int
#define ld long double
#define vll vector<ll>
#define pll pair<ll,ll>
#define vl(p) vector<p>
#define w while
#define For(i,s,x) for(i=s;i<x;i++)
#define Fore(i,s,x) for(i=s;i<=x;i++)
#define FOR(i,x) for(i=0;i<x;i++)
#define Rof(i,s,x) for(i=s;i>=x;i--)
#define all(v) v.begin(),v.end()
#define it(r,v) for(auto r=v.begin();r!=v.end();r++)
#define pb push_back
#define in insert
#define sz size()
#define nl cout<<"\n"
#define pr(a) cout<<a<<" "
#define pr2(a,b) cout<<a<<" "<<b<<"\n"
#define pr3(a,b,c) cout<<a<<" "<<b<<" "<<c<<"\n"
#define mod 1000000007
vector<ll>::iterator it;
vector<vector<ll> >::iterator itr;
//Function to Check if we reach the Goal State or not.
ll is_goal(ll arr1[3][3],ll arr2[3][3])
{
 ll r=0,i,j;
 FOR(i,3)
 FOR(j,3)
 if(arr1[i][j]!=arr2[i][j])
 r++;
 return r;
}
int main()
{
 ll initial[3][3],goal[3][3];
 ll i,j,k,l,x,y,c,temp,flag=0;
 vector<vector<ll> >vect;
 vector<vector<ll> >ans;
 vector<ll>v;
 map<ll,ll>mov;
 map<ll,ll>parent;
 mov[0]=0;
 parent[0]=-1;
 cout<<"****** 8 Puzzle Problem ********"<<"\n";
 cout<<"Note : Enter 0 at the blank space"<<"\n";
 cout<<"Enter the initial State of Puzzle"<<"\n";
 FOR(i,3)
 FOR(j,3)
 {
 cin>>initial[i][j];
 v.push_back(initial[i][j]);
 }
 vect.push_back(v);
 v.clear();
 cout<<"Enter the Goal State of the puzzle"<<"\n";
 FOR(i,3)
 FOR(j,3)
 cin>>goal[i][j];
 //Storing the node to be explored in array
 for(i=0;i<vect.size();i++)
 {
 ll r=0,s=0;
 for(j=0;j<vect[i].size();j++)
 {
 initial[r][s]=vect[i][j];
 s++;
 if(s==3)
 {
 r++;
 s=0;
 }
 }
 //Check for goal state
 c=is_goal(initial,goal);
 if(c==0)
 break;
 //Finding place of 0 (Blank Space)
 ll q=0;
 FOR(k,3)
 {
 FOR(l,3)
 if(initial[k][l]==0)
 {
 x=k; y=l;
 q=1;
 break;
 }
 if(q==1)
 break;
 }
 ll up[3][3], down[3][3], right[3][3],left[3][3];
 FOR(k,3)
 {
 FOR(l,3)
 {
 up[k][l]=initial[k][l];
 down[k][l]=initial[k][l];
 right[k][l]=initial[k][l];
 left[k][l]=initial[k][l];
 }
 }
 //Up Movement
 if(x-1>=0&&mov[i]!=2)
 {
 temp=up[x-1][y];
 up[x-1][y]=up[x][y];
 up[x][y]=temp;
 FOR(k,3)
 FOR(l,3)
 v.push_back(up[k][l]);
 vect.push_back(v);
 v.clear();
 mov[vect.size()-1]=1;
 parent[vect.size()-1]=i;
 c=is_goal(up,goal);
 if(c==0)
 break;
 }
 //Down Movement
 if(x+1<=2&&mov[i]!=1)
 {
 temp=down[x+1][y];
 down[x+1][y]=down[x][y];
 down[x][y]=temp;
 FOR(k,3)
 FOR(l,3)
 v.push_back(down[k][l]);
 vect.push_back(v);
 v.clear();
 mov[vect.size()-1]=2;
 parent[vect.size()-1]=i;
 c=is_goal(down,goal);
 if(c==0)
 break;
 }
 // Right Movement
 if(y+1<=2&&mov[i]!=4)
 {
 temp=right[x][y+1];
 right[x][y+1]=right[x][y];
 right[x][y]=temp;
 FOR(k,3)
 FOR(l,3)
 v.push_back(right[k][l]);
 vect.push_back(v);
 v.clear();
 mov[vect.size()-1]=3;
 parent[vect.size()-1]=i;
 c=is_goal(right,goal);
 if(c==0)
 break;
 }
 // Left Movement
 if(y-1>=0&&mov[i]!=3)
 {
 temp=left[x][y-1];
 left[x][y-1]=left[x][y];
 left[x][y]=temp;
 FOR(k,3)
 FOR(l,3)
 v.push_back(left[k][l]);
 vect.push_back(v);
 v.clear();
 mov[vect.size()-1]=4;
 parent[vect.size()-1]=i;
 c=is_goal(left,goal);
 if(c==0)
 break;
 }
 }
 //Printint the required result;
 for(i=vect.size()-1;i>=0;)
 {
 for(j=0;j<vect[i].size();j++)
 {
 v.push_back(vect[i][j]);
 }
 ans.push_back(v);
 v.clear();
 i=parent[i];
 }
 nl;
 cout<<"Required Moves To Solve the puzzel"<<"\n";
 for(i=ans.size();i>=0;i--)
 {
 nl;
 for(j=0;j<ans[i].size();j++)
 {
 cout<<ans[i][j]<<" ";
 if(j==2||j==5||j==8)
 nl;
 }
 }
}