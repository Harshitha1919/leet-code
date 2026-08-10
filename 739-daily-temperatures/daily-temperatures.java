class Solution {
    public int[] dailyTemperatures(int[] t) {

      int ans[] =new int[t.length];
      Arrays.fill(ans,0);
      Stack<Integer> s=new Stack<>();
      int prev=0;
      for(int i=0;i<t.length;i++){
          while(!s.isEmpty() && t[s.peek()]<t[i]){
            prev=s.pop();
            ans[prev]=i-prev;
          }
          s.add(i);
      }  
      return ans;


    }
}