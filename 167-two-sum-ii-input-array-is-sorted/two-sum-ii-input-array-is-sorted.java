class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low=0;
        int high=numbers.length-1;
        int a[]=new int[2];
        while(low<high){
                int sum=numbers[low]+numbers[high];
                
                if(sum>target){
                    high--;
                }
                else if(sum<target){
                    low++;
                }
                else{
                     a[0]=low+1;
                     a[1]=high+1;
                     break;

                }
        }
        return a;
    }
}