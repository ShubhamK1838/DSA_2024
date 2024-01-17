public class _19_game {
    
    // https://leetcode.com/problems/minimum-number-game/


    class Solution {
        public int[] numberGame(int[] nums) {
            int arr[]=new int[nums.length]; 
            int cnt=0; 
            int b; int a; 
            int tmp=getMax(nums)+1;
    
    
            for(int i=0; i<nums.length/2; i++)
            {
                a=getMin(nums,tmp); 
                b=getMin(nums,tmp); 
                arr[cnt]=b;
                cnt++;  
                arr[cnt]=a; 
                cnt++; 
            } 
    
            return arr; 
            
        }
        public int  getMax(int ar[])
        {
            int max=ar[0];
            for(int i:ar)
            if(i>max)
            max=i; 
            return max; 
        }
        public int  getMin(int ar[], int tmp )
        {
            int i=0; 
            int min; 
            for(int j=0; j<ar.length;  j++)
            {
                if(ar[j]<ar[i])
                {
                    i=j; 
                }
            }   
            min=ar[i]; 
            ar[i]=tmp; 
            return min; 
        }
    }
}
