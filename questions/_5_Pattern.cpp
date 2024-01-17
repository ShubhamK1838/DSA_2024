#include<iostream> 

using namespace std; 


main()
{
    int number=19;
    // cin>>number; 

    // pattern : 2
    for(int i=0; i<number; i++)
    {

      if(i%2==0){
        for(int k=0; k<(number-i)/2; k++)
        {
            cout<<" ";
        }

        for(int j=0; j<=i;  j++)
        {
            
            cout<<"*"; 
        }
        cout<<"\n"; 
      }
        
    }

    // pattern : 1  
    // for(int i=0; i<number; i++)
    // {
    //     for(int j=0; j<number; j++)
    //     {
    //         if(i==j || (i+j)==number)
    //         {
    //             cout<<"*"; 
    //         }else
    //         {
    //             cout<<" "; 
    //         }

    //     };
        // cout<<"\n"; 
    // }




}