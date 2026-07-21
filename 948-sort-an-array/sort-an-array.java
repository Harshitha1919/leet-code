class Solution {
    public void merge(int nums[],int low,int mid,int high){
           int left=low;
           int right=mid+1;
           int [] temp=new int[high-low+1];
           int k=0;
           while(left<=mid && right<=high){
            if(nums[left]>nums[right]){
                temp[k++]=nums[right];
                right++;
            }
            else{
                temp[k++]=nums[left];
                left++;
            }
           }
           while(left<=mid){
            temp[k++]=nums[left];
            left++;
           }

           while(right<=high){
            temp[k++]=nums[right];
            right++;
           }
           for (int i = 0; i < temp.length; i++) {
    nums[low + i] = temp[i];
}
    }
    public void mergeSort(int []nums,int low,int high){
        if(low>=high){
            return ;
        }
        int mid=low+(high-low)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
        
        }

    
    public int[] sortArray(int[] nums) {
       
          mergeSort(nums,0,nums.length-1);
          return nums;
    }
}