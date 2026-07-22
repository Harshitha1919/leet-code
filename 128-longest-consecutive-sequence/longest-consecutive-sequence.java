class Solution {
    public int longestConsecutive(int[] num) {
        if(num.length==0){
            return 0;
        }
        int Max=1;
        int c=1;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<num.length;i++){
            hs.add(num[i]);
        }
        int nums[]=new int[hs.size()];
        int j=0;
        for(int i:hs){
            nums[j]=i;
            j++;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                   c++;
            }
            else{
               
                c=1;
            }
             Max=Math.max(c,Max);

        }
        return Max;
    }
}