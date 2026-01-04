class Solution {
    public int sumFourDivisors(int[] nums) {
        
        int maxsum=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
          
            int j=1;
            int sum=0;
            int h=0;
            while(j<=n ){
              if(n%j==0){
                sum=sum+j;
                 h++;
               
              }
              if(h>4){
                break;
              }
              j++;
            }
            if(h==4){
                maxsum=sum+maxsum;
            }
        }
        return maxsum;
    }
}