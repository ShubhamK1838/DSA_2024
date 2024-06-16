public class _18_Leetcode {
    // https://leetcode.com/problems/find-the-score-of-all-prefixes-of-an-array/
    class Solution {
        public long[] findPrefixScore(int[] nums) {
            
            int max=nums[0], cur; 
            
            long ar[]=new long[nums.length]; 
    
            long prev=0; 
            for(int i=0; i<ar.length; i++)
            {
                if(max<nums[i])
                {
                    max=nums[i]; 
                }
                ar[i]=nums[i]+max+prev; 
                prev=ar[i]; 
            }
    
            return ar; 
        }
    }
}
