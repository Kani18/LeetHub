//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking total count of elements
            int n = sc.nextInt();

            // creating a new array of size n
            int arr[] = new int[n];

            // inserting elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            // calling firstRepeated method
            // and printing the result
            System.out.println(ob.firstRepeated(arr, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
      /*  int ans=0;
        int nr=0;
        int min=999999999;
        for(int i=0;i<n;i++){
            int c=1;
            for(int j=0;j<n;j++){
                if(i != j){
                    if(arr[i]==arr[j])
                       c+=1;
                }
            }
            if(c!=1 && i<min){
             // ans=arr[i];
             nr+=1;
              min=i+1;
            }
            
        }
       // if(nr==0)
          
        return (nr==0) ? -1 :min;
    }
}*/



 HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
       for(int i=0; i<n; i++)
       {
           if(hm.containsKey(arr[i]))
           {
               hm.put(arr[i], hm.get(arr[i]) + 1);
           }
           else
           hm.put(arr[i],1);
       }
       for(int i=0; i<n; i++)
       {
           if(hm.get(arr[i]) > 1)
           return i+1;
       }
       return -1;
    }
}