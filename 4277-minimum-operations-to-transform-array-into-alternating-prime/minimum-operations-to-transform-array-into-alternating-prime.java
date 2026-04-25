class Solution {
    private boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
               if(n%i==0){
                return false;
               }
        }
        return true;
    }
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
           
            if(i%2==0){
            while(isPrime(nums[i])==false){
                 nums[i]=nums[i]+1;
                 c++;
            }
            }
            else{
                 while(isPrime(nums[i])==true){
                 nums[i]=nums[i]+1;
                 c++;
            }
            }
        }
       
        return c;
    }
}