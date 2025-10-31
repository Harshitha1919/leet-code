class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
         HashSet<Integer> hs1=new HashSet<>();

        for(int i=0;i<nums.length;i++){
          if(!hs.contains(nums[i])){
            hs.add(nums[i]);
          }
          else{
            hs1.add(nums[i]);
          }
        }
   int arr[]=new int[2];
   int i=0;
    for(int num:hs1){
        arr[i]=num;
        i++;
    }
       
       return arr;
    }
}