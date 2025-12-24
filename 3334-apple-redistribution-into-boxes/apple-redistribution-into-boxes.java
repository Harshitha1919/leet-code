class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n=capacity.length;
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum=sum+apple[i];
        }
        Arrays.sort(capacity);
        int c=0;
        int i=n-1;
        while(sum>0){
        
               sum=sum-capacity[i];
               c++;
               i--;

         
            
        }
        return c;
    }
}