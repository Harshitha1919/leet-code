class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int a,b,c;
        int n=nums.length;
            a=nums[n-1];
            b=nums[n-2];
            c=nums[n-3];
            if(((a+b)>c) && ((b+c)>a) && ((c+a)>b)){
                 return (a+b+c);
            }
            n=n-1;
        while(n>2){
                 a=nums[n-1];
                 b=nums[n-2];
                 c=nums[n-3];
                 if(((a+b)>c) && ((b+c)>a) && ((c+a)>b)){
                    return (a+b+c);
                 }
                 n=n-1;
                
            }
            
    
    return 0;
    }    
}