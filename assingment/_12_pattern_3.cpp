/*
C program to print square or rectangle star pattern
*/

#include<iostream> 


using namespace std; 

main()
{


    int rows=6; 

    for(int i=0; i<rows; i++)
    {
        for(int i=0; i<rows; i++)
        {
            cout<<"*"; 
        }
        cout<<'\n'; 
    }
    
}