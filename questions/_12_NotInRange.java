import java.util.ArrayList;
import java.util.List;

public class _12_NotInRange {

    // https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

    class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        

        List<Integer> list=new ArrayList(); 
        
        boolean ar[]=new boolean[nums.length+1]; 
        int ind; 
       for(int i=0; i<nums.length; i++)
       {
            ind=nums[i]; 
            ar[ind]=true; 
       }
       for(int i=1; i<ar.length; i++)
       {
            if(ar[i]==false)
            list.add(i);

       }
        return list; 

    }
}

    
}


