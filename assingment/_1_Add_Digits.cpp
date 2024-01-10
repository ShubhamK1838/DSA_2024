// https://leetcode.com/problems/add-digits/

class Solution {
public:


    int addDigits(int num) {
        
      
      int digit=getDigit(num); 

      while(!(digit<10 && digit>-10))
      {
          digit=getDigit(digit); 
      }


        return digit; 

    }


    int getDigit(int num)
    {
          int digit_addition=0; 

        while(num>0)
        {
            digit_addition+=(num%10); 

            num/=10;
        }        
         return digit_addition; 

    }
};