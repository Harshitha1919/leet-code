class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr.add(nums[i]);
                
            }
        }

         for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                arr.add(nums[i]);
            }
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return nums;

    }
}