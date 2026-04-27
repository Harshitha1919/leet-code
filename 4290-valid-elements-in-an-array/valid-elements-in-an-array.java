class Solution {
    public List<Integer> findValidElements(int[] nums) {
       
        List<Integer> arr=new ArrayList<>();
           if(nums.length==1){
            arr.add(nums[0]);
            return arr;
        }
        int pre[]=new int[nums.length];
        int pre1[]=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=Math.max(nums[i],pre[i-1]);
        }
          pre1[nums.length-1]=nums[nums.length-1];
          for(int i=nums.length-2;i>=0;i--){
            pre1[i]=Math.max(pre1[i+1],nums[i]);
        }
      
        arr.add(nums[0]);

        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>pre[i-1] || nums[i]>pre1[i+1]){
                arr.add(nums[i]);
            }
        }

      
        arr.add(nums[nums.length-1]);
        return arr;
    }
}