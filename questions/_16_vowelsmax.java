public class _16_vowelsmax {


    // c:\Users\shubh\Developer\DSA\_14_RotateArray.java c:\Users\shubh\Developer\DSA\_15_AverageSubArray.java

    class Solution {
        public int maxVowels(String s, int k) {
            
            
            int cur_substring=0; 
            
            int i=0;
            String  c; 
            String vowels=" a e i o u A E I O U " ; 
            for( i=0; i<k ;  i++ )
            {
                c=""+s.charAt(i); 
    
                if(vowels.contains(c))
                {
                    cur_substring++; 
                }
            }
            i=0; 
            int max_substring=cur_substring ; 
    
            String f, e ; 
    
            while(k<s.length())
            {
                f=""+s.charAt(i++); 
                e=""+s.charAt(k++); 
    
                if(vowels.contains(f))
                {
                    cur_substring--; 
                }
                if(vowels.contains(e))
                {
                    cur_substring++; 
                }
    
                if(max_substring<cur_substring)
                {
                    max_substring=cur_substring;
                }
            }
    
            return max_substring; 
    
    
        }
    }
    
}
