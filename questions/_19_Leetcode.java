public class _19_Leetcode {
    // https://leetcode.com/problems/left-and-right-sum-differences/
    class Solution {
        public int[] leftRightDifference(int[] nums) {
    
          int ar1[]=new int[nums.length]; 
          int ar2[]=new int[nums.length]; 
          int cnt1=0;  int cnt2=ar2.length-1; 
          ar1[cnt1++]=0; 
          ar2[cnt2--]=0; 
    
          for(int i=1; i<ar1.length; i++ )
          {
            ar1[i]=ar1[i-1]+nums[i-1];
          }
          for(int i=cnt2; i>=0; i--)
          {
            ar2[i]=ar2[i+1]+nums[i+1];
          }
    
           
           int ar[]=new int[nums.length]; 
    
           for(int i=0; i<ar.length; i++)
           {
                ar[i]=Math.abs(ar1[i]-ar2[i]); 
           }
    
    
          return ar; 
            
        }
    }
    
}
