// https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1


class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
        long min=a[0]; 
        long max=min; 
        for(long  i: a)
        {
            if(i<min)
            {
                min=i; 
            }
            if(i>max)
                max=i; 
        }
        
        
        return new Pair(min,max); 
    }
}