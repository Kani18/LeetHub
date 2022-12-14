class Solution {
    public void rotate(int[] arr, int d) {
        int n=arr.length;
       
      /*  while(d>0){
        int first=arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
            arr[0]=first;
            d-=1;
        }*/
        d=d%n;
          reverse(arr,0,n-d-1);
      reverse(arr,n-d,n-1);
      reverse(arr,0,n-1);
       
    }
 void  reverse(int[] arr,int a,int b){
        while(a<b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        a++;
        b--;
        }
    }

    
}