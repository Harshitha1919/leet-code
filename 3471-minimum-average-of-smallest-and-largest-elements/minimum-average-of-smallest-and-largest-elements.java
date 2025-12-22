class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        
        double avg=0;
        double min1=Double.MAX_VALUE;
        while(arr.size()>0){
            int start=arr.get(0);
            int end=arr.get(arr.size()-1);
             avg=(start+end)/2.0;
             min1=Math.min(avg,min1);
             arr.remove(0);
             arr.remove(arr.size()-1);


        }
        return min1;
    }
}