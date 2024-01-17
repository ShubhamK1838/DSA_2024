#include<iostream> 

using namespace std; 

class Sorted
{   
    public : 

    bool arraySortedOrNot(int []ar, int n) {
       
       for(int i=1; i<n; i++)
       {
           if(!(ar[i-1]<=ar[i]))
           {
               return false;
           }
       }
       
       return true; 
    }

}; 