import java.util.ArrayList;

public class _13_CommonEle {

    // https://www.geeksforgeeks.org/problems/common-elements1132/1



    
class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        
        ArrayList<Integer> list=new ArrayList(); 
        
        int c1=0, c2=0, c3=0; 
    
        while(c1<n1 && c2<n2 && c3<n3)
        {
            
            if(A[c1]==B[c2] && B[c2]==C[c3])
            {
                if(!list.contains(A[c1]))  
                list.add(A[c1]); 
                
                c1++; c2++;  c3++; 
                
            }
            else if(A[c1]<B[c2])
            {
                c1++; 
            }else  if(B[c2]< C[c3])
            {
                c2++; 
            }else
            {
                c3++; 
            }
        }
       
       return list; 
    }
}
}
