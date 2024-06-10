
public class _8_factorial_Rescursion{
    
    public static void main(String ar[])
    {

            System.out.println(" The Factorial is: " + fact(3)); 

    }

    public static long  fact(long n)
    {

        if(n==0) return 1; 

        if(n<=1)
        {
            return n; 
        }
        return fact((n-1))*n; 
    }
    
}