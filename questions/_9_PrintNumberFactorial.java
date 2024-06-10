public class _9_PrintNumberFactorial {


    public static void main(String ar[])
    {
        print(1,10); 
    }
    public static void  print(int start, int end)
    { 
        
        if(start-1==end)
        {
            return ; 
        }else
        {
            System.out.println(start++); 
            print(start, end); 
        }
    }
    
}
