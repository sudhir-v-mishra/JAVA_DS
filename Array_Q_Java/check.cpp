#include<bits/stdc++.h>
using namespace std;
string find(vector<int>&nums){
int n=nums.size();
int i=0;
int j=1;
for(int i=0;i<n-1;i++){
    for(int j=i+1;j<n;j++){
        string s1=to_string(nums[i]);
        string s2=to_string(nums[j]);
        string con1=s1+s2;
        string con2=s2+s1;
        long long num1=stoi(con1);
        long long num2=stoi(con2);
        if(num1<num2){
            swap(nums[i],nums[j]);
        }

    }
}
string hold="";
for(int i=0;i<n;i++){
    string num=to_string(nums[i]);
    hold+=num;
}

return hold;
}



int main(){
int n;
cin>>n;
vector<int>arr;
for(int i=0;i<n;i++){
    int k;
    cin>>k;
    
   arr.push_back(k); 
    
    }

    cout<<find(arr);
}