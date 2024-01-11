// https://www.geeksforgeeks.org/problems/prime-number2314/1

#include<iostream> 
#include<math.h> 

class Solution {
public:
  
    bool isPrime(int n)
    {
        if(n<=1) return false; 


        for(int i=2 ; i<sqrt(n); i++)
        {
            if(n%i==0)
            return false; 
        }

        return 1; 
    }

};