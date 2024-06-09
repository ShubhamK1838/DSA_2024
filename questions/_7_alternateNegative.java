// https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1




class Solution {
    void rearrange(int arr[], int n) {
       
       int pos[]=new int[n],np=0; 
       int neg[]=new int[n],nn=0; 
       
       for(int i=0; i<n; i++)
        {
            if(arr[i]>=0)
                pos[np++]=arr[i]; 
            else
                neg[nn++]=arr[i];
        }
	    
	    int c1=0, c2=0; 
	    int i=0;
	    while(c1<np && c2<nn)
	    {
	        if(i%2==0)
	            arr[i]=pos[c1++]; 
	        else
	            arr[i]=neg[c2++]; 
	       
	       i++; 
	    }
	    
	    while(c1<np)
	    {
	        arr[i++]=pos[c1++]; 
	        
	    }
	    while(c2<nn)
	    {
	        arr[i++]=neg[c2++]; 
	    }
	    
    }
}