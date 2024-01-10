// prints all primes from 1 to 100

#include<iostream > 
using namespace std; 



bool isPrime(int n)
{
    if(n ==1 ) return false; 
    for(int i=2; i<n; i++)
    {
        if(n%i==0)
        {
            return false; 
        }
    }
    return true; 
}


main()
{

    for(int i=1; i<=100; i++)
        if(isPrime(i))
        cout<<i<<"\t"; 
        

}