//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    
    
    void mergeSort(int arr[], int l, int r)
    {
        //code here\
        if(l<r){
            int m=l+(r-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
        
        
        
    }
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
          int i=l;
          int j=m+1;
          int k=0;
          
          int[] mer=new int[r-l+1];
          while(i<=m && j<=r){
              if(arr[i] <= arr[j]){
                  mer[k++]=arr[i++];
              }
              else{
                mer[k]=arr[j];
                k++;
                j++;
            }
        }
        
        while(i<=m){
              mer[k]=arr[i];
                k++;
                i++;
        }
        while(j<=r){
              mer[k]=arr[j];
                k++;
                j++;
        }
        
        for(int p=0;p<mer.length;p++){
            arr[l+p]=mer[p];
        }
        
    }
}
         
