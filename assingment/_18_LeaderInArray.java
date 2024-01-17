// https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

import java.util.ArrayList; 

public class _18_LeaderInArray {

    


class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list =new ArrayList<>(); 
        
        int r=n-1; 
        int i=r-1; 
        list.add(arr[r]); 
        
        
        while(i>=0)
        {
            if(arr[i]>=arr[r])
            {
                list.add(arr[i]); 
                r=i;
                i--; 
            }else
            {
                i--; 
            }
        }
        int tmp; 
        r=list.size()-1;
        i=0; 
        while(i<=r){
            tmp=list.get(i); 
            list.set(i,list.get(r)); 
            list.set(r, tmp); 
            i++; 
            r--; 
        }
        
        
        return list; 
    }
}



}
