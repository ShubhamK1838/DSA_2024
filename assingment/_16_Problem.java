
// https://leetcode.com/problems/number-of-employees-who-met-the-target/submissions/1147757456/


public class _16_Problem {
    
}



class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int number_of_employee=0; 
        for(int i=0; i<hours.length; i++)
        {
            if(hours[i]>=target)
            {
                number_of_employee++; 
            }
        }

        return number_of_employee; 
        
    }
}