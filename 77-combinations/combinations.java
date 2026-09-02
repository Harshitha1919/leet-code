class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> arr=new ArrayList<>();
    public void combination(int n,int start,int k){
        if(start==n+1){
            return;
        }
        for(int i=start;i<=n;i++){
            arr.add(i);
            if(arr.size()==k){
                ans.add(new ArrayList<>(arr));
            }
            combination(n,i+1,k);
            arr.remove(arr.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        combination(n,1,k);
        return ans;
    }
}