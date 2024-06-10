#include<iostream>


using namespace std; 

// https://leetcode.com/problems/powx-n/ls
class Solution {
    public:
        double myPow(double x, int n) {
            
            if(n<0)
            return 1/helper(x,abs(n)); 
            return helper(x, n); 
        }
    
        double helper(double x, int n)
        {
            if(n==0) return 1.0; 
    
            double d= helper(x, n/2); 
    
            if(n%2==0)
            {
                return d*d; 
            }else
            {
                return d*d*x; 
            }
        }
    };
