class Solution {
    public int minElement(int[] nums) {
        int mins=1000000;
      for(int i=0;i<nums.length;i++){
        int n=nums[i];
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
       mins= Math.min(mins,sum);
      } 
      return mins; 
    }
}