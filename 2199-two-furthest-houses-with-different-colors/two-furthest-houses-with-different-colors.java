class Solution {
    public int maxDistance(int[] colors) {
        int i=0;
        int j=colors.length-1;
        int max=0;
       while(i<j){
           if(colors[i]!=colors[j]){
                max=Math.max(max,Math.abs(i-j));
                i++;
                j=colors.length-1;
           }
           else{
             j--;
           }
       }
       return max;
    }
}