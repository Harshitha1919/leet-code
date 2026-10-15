class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int j=0;j<nums.size();j++){

        for(int i=j;i<nums.size();i++){
            hs.add(nums.get(i));
            sum=sum+(hs.size()*hs.size()); 
        }
        hs.clear();
        }
        return sum;
    }
}