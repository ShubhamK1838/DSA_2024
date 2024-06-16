public class _15_AverageSubArray {

    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int kk=k; 
            double  cur_avg=0, max_avg=0; 
             int i=0; 
            while(i<k  && i<nums.length)
            {
                cur_avg+=nums[i]; 
                i++; 
            }
    
            max_avg=cur_avg/kk; 
            System.out.println(cur_avg/k); 
            i=0; 
            while(k<nums.length )
            {
                   System.out.println(cur_avg); 
                 cur_avg-=nums[i++]; 
                cur_avg+=nums[k++]; 
    
               
               
                if(max_avg<cur_avg/kk)
                    max_avg=cur_avg/kk; 
    
                
            }
    
    
    
            return max_avg; 
    
        }
    }
    
}
