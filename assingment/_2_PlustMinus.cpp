// https://codeforces.com/problemset/problem/1807/A

#include<iostream> 


using namespace std; 

char plusMinus(int a, int b, int c)
{
    if(a+b==c)
    {
        return '+'; 
    }else if(a-b==c){
        return '-';
    }else
    {
        return '0'; 
    }
}; 

int main()
{

    int a, b, c; 
    cin>> a>>b>>c; 

    cout<< "Result : "<<plusMinus(a,b,c); 
    

}