class Solution {
    public int[] sortArray(int[] arr) {
        int n=arr.length;
        
        if(n==1)
            return arr;
        int mid=n/2;
        
        int[] left=sortArray(Arrays.copyOfRange(arr,0,mid));
        int[] right=sortArray(Arrays.copyOfRange(arr,mid,n));
        
        return merge(left,right);
    }
    public int[] merge(int[] l,int[] r){
        
        int ln=l.length;
        int rm=r.length;
        
        int[] merge=new int[ln+rm];
        
        int i=0;
        int j=0;
        int k=0;
        
        while(i<ln && j<rm){
            if(l[i] < r[j]){
                merge[k]=l[i];
                k++;
                i++;
            }
            else{
                merge[k]=r[j];
                k++;
                j++;
            }
        }
        
        while(i<ln){
              merge[k]=l[i];
                k++;
                i++;
        }
        while(j<rm){
              merge[k]=r[j];
                k++;
                j++;
        }
        
        return merge;
        
    }
}
        
        /*  int n=arr.length;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
              if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
        }
        }
        
        
        return arr;
    }
}
 */
