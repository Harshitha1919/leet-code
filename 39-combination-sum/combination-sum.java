class Solution {
   int sum = 0;
    List<Integer> ans = new ArrayList<>();
    List<List<Integer>> arr = new ArrayList<>();
    public void sum(int[] c,int target,int sum,int start,List<List<Integer>> arr){
        if(sum==target){
            arr.add(new ArrayList<>(ans));
            return;
        }
           for(int i=start;i<c.length;i++){
            if(sum+c[i]<=target){
                sum=sum+c[i];
                ans.add(c[i]);
                sum(c,target,sum,i,arr);
                  ans.remove(ans.size()-1);
                  sum=sum-c[i];
          
                
            }
          
           
        }
    }

    
    public List<List<Integer>> combinationSum(int[] c, int target) {
      
        sum(c,target,0,0,arr);
        return arr;

    }
}