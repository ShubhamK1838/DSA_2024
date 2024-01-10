// https://leetcode.com/problems/number-of-common-factors/

class Solution {
public:
    int commonFactors(int a, int b) {
        
        int min=getMin(a,b); 
        int cnt=0; 
        for(int i=1; i<=min; i++)
        {
            if(a%i==0 && b%i==0)
            {
                cnt++; 
            }
        }


        return cnt;
    }; 

    int getMin(int a, int b)
    {
        if(a<b)
        {
            return a; 
        }
        
        return b; 
    }
};