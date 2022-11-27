class Solution {
    public void sortColors(int[] a) {
            //COUNT SORT
        int count0=0;
        int count1=0;
        int count2=0;
        
        for(int i=0;i<a.length;i++){
            if(a[i] == 0)
                count0+=1;
            if(a[i] == 1)
                count1+=1;
            if(a[i] == 2)
                count2+=1;
        }
        
        for(int i=0;i<count0;i++)
            a[i]=0;
        
        for(int i=count0;i<count0+count1;i++)
            a[i]=1;
        
        for(int i=count0+count1;i<a.length;i++)
            a[i]=2;
        
    }
}
        
    