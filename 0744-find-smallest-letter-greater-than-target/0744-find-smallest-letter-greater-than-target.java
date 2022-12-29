class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       int n=letters.length;
        
        if(target>=letters[n-1])
            return letters[0];
        
        int l=0;
        int h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;

            if(target>=letters[mid])
                l=mid+1;
            else
                h=mid-1;;
        }
        return letters[l];
    }
}