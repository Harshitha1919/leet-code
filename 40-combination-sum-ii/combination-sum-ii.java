class Solution {
    List<List<Integer>> arr=new ArrayList<>();
    List<Integer> ans=new ArrayList<>();
  int sum=0;
     public void sum(int[] c,int start,int target){
             if(start==c.length){
                return;
             }
             for(int i=start;i<c.length;i++){
                 if (i > start && c[i] == c[i - 1]) {
                continue;
            }
                if(sum>target){
                    break;
                    }
                    sum=sum+c[i];
                    ans.add(c[i]);
                   

               
           

                if(sum==target){
                    arr.add(new ArrayList<>(ans));
                }
                else{
                    
                    sum(c,i+1,target);
                }
                    sum=sum-c[i];
                    ans.remove(ans.size()-1);
                
                }
              

             
     }
    public List<List<Integer>> combinationSum2(int[] c, int target) {
        Arrays.sort(c);
        sum(c,0,target);
        return arr;
    }
}