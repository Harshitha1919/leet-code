class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
         int arr[]=new int[2];
         int j=0;
        for(int i=0;i<nums.length;i++){
          if(!hs.contains(nums[i])){
            hs.add(nums[i]);
          }
          else{
         arr[j]=nums[i];
         j++;
          }
        }
   
   
   
       
       return arr;
    }
}