#include<iostream> 

using namespace std; 


main()
{


    int fact_sum=0; 
    int number; 
    cin>>number; 
    for(int i=1 ; i<number; i++)
    {
        if(number%i==0)
        fact_sum+=i; 
    }

    cout<<"\nResult: "<<(fact_sum==number?"True":"false"); 


    return 0; 
}