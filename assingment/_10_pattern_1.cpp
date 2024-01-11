/*

C program to print number pattern with 1, 0 at alternate rows
*/

#include<iostream > 

using namespace std; 

 int main()
 {

    int pat=1; 
    int rows=5; 
    for(int i=0; i<rows; i++)
    {
        for(int j=0; j<rows; j++ )
        {
            cout<<pat; 
        }
        cout<<"\n";
        if(pat==0) pat=1; 
        else pat=0; 
    }
 }