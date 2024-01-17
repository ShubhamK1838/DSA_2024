

class ArraySum 
{
    public : 

        int arraySum(int ar[], int n)
        {
            int array_sum=0; 

            for(int i=0; i< n; i++)
            {
                array_sum+=ar[i]; 
            }


            return array_sum; 
        }
}; 