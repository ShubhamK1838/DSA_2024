// https://leetcode.com/problems/ugly-number/description/

//  Ugly Number : a number is positive integer and which has primer factor are limited and it is 2,3, 5 and ow. not 


class Solution {
public:
    bool isUgly(int n) {

        if(n<=0) return false; 
        while(n%2==0)
        {
            n/=2; 
        }

        while(n%3==0)
        {
            n/=3; 
        }

        while(n%5 ==0)
        {
            n/=5; 
        }

        if(n==1)
        return true; 
        return false; 
        
    }
};