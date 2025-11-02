class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int start=nums[0];
        int j=0;
        int last=nums[nums.length-1];
       for(int i=start;i<=last;i++){

          if(nums[j]!=i){
            list.add(i);
            
          }
          else{
            j++;
          }
          
       }
       return list;

    }
}