/* 
C program to print right triangle star pattern
*/


#include<iostream> 

using namespace std; 

main()
{
     int rows=6; 

     for(int i=0; i< rows; i++)
     {
        for(int j=0; j<=i; j++)
        {
            cout<<"*"; 
        }
        cout<<"\n"; 
     }
}