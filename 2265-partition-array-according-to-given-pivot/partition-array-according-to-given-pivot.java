class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                arr.add(nums[i]);
            }
            if(nums[i]==pivot){
            arr1.add(nums[i]);
            }
            if(nums[i]>pivot){
                arr2.add(nums[i]);
            }
        }
        arr.addAll(arr1);
        arr.addAll(arr2);
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return nums;
}
}