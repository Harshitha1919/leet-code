class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;

        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int a[]=new int[nums.length];
        int min=0;
        for(int i=0;i<nums.length;i++){
            min=Math.max(min,nums[i]);
            a[i]=gcd(nums[i],min);
        }
        Arrays.sort(a);
             int i=0;
             int j=nums.length-1;
             Long sum=0L;
        while(i<nums.length/2  && j>0){
               sum=sum+gcd(a[i],a[j]);
               i++;
               j--;
        }
        return sum;

    }
}