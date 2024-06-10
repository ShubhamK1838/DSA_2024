public class _10_FiboRecursion {

    public static void main(String ar[])
    {
        int i=fibo(100); 
        System.out.println(i);
    }

    public static  int   fibo(int n )
    {
        
        
        int a=0, b=1; 
        int tmp=0; 


        if(n==1) return a; 

        for(int i=0; i< n-2; i++)
        {
            tmp=a+b; 

            a=b; 
            b=tmp; 
        }


        return b; 
    }
    
}
