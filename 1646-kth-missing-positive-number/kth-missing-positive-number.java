class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int j=0;
        for(int i=1; ;i++){
            if(!hs.contains(i)){
                j++;
            }
            if(j==k){
                return i;
            }
        }
    }
}