class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        arr.add(nums[0]);
        arr1.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(arr.get(arr.size()-1)>arr1.get(arr1.size()-1)){
                arr.add(nums[i]);
            }
            else{
                arr1.add(nums[i]);
            }
        }
        for(int i=0;i<arr1.size();i++){
            arr.add(arr1.get(i));
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr.get(i);
        }
        return nums;

    }
}